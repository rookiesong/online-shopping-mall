package net.suncaper.demo.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradeRefundModel;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.alipay.demo.trade.service.AlipayTradeService;
import net.suncaper.demo.configuration.AlipayProperties;
import net.suncaper.demo.domain.Cart;
import net.suncaper.demo.domain.Orders;
import net.suncaper.demo.domain.PaymentRecord;
import net.suncaper.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.*;

import static net.suncaper.demo.controller.UserController.getCookieByName;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private CartService cartService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private PaymentRecordService paymentRecordService;
    @Autowired
    private DeliveryAddressService deliveryAddressService;
    @Autowired
    private AlipayProperties aliPayProperties;

    @Autowired
    private AlipayClient alipayClient;

    @Autowired
    private AlipayTradeService alipayTradeService;


    @GetMapping("/addOrderPage")
    public String addOrderPage(Model model,HttpServletRequest request){
        HttpSession httpSession = request.getSession();
        String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
        model.addAttribute("payments",paymentService.allPayment());
        model.addAttribute("deliveryAddresses",deliveryAddressService.findDeliveryAddress(userMailaddress));
        int sum = ordersService.countPrice((List<Orders>)httpSession.getAttribute("ordersList"));
        model.addAttribute("sum",sum);
        return "/pages/addorderpage.html";
    }

    @PostMapping("/addOrder")
    @ResponseBody
    public Map<String,String> addOrder(@RequestParam(value = "cartIds[]") String[] cartIds,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            HttpSession httpSession = request.getSession();
            httpSession.removeAttribute("cartProducts");
            httpSession.removeAttribute("ordersList");
            httpSession.setAttribute("cartProducts",cartService.addOrderCartProduct(cartIds));
            httpSession.setAttribute("ordersList",ordersService.addOrder(cartIds,userMailaddress));
            map.put("status", "ok");
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }



    @PostMapping("/deleteOrder")
    @ResponseBody
    public Map<String,String> deleteOrder(@RequestParam(value = "ordersId") String ordersId,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            map.put("status", ordersService.deleteOrder(ordersId));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @PostMapping("/editOrder")
    @ResponseBody
    public Map<String,String> editOrder(@RequestParam(value = "ordersId") String ordersId,@RequestParam(value = "newStatus") String newStatus,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            map.put("status", ordersService.editOrder(ordersId,newStatus));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }
    @PostMapping("/refundOrder")
    @ResponseBody
    public Map<String,String> refundOrder(@RequestParam(value = "ordersId") String ordersId,HttpServletRequest request) throws AlipayApiException {
        Map<String,String> map = new HashMap<>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            Orders orders = ordersService.findOrder(ordersId);
            PaymentRecord paymentRecord = paymentRecordService.findPaymentRecord(ordersId);
            HttpSession session = request.getSession();
            session.setAttribute("refundSum",orders.getNumber()*orders.getPrice()+"");
            session.setAttribute("orderNo",paymentRecord.getRecordId());
            refund(request);
            ordersService.editOrder(ordersId,"success");
            map.put("status","ok");
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @GetMapping("/showOrders")
    public String orderPage(HttpServletRequest request,Model model){
        //所有的订单
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            List<Orders> ordersList = ordersService.showOrder(userMailaddress);
            model.addAttribute("ordersList",ordersList);
            List<Map<String,Object>> results = new ArrayList<>();
            for (Orders orders:ordersList
                 ) {
                Map<String,Object> result = new HashMap<>();
                result.put("orders",orders);
                result.put("sum",""+orders.getNumber()*orders.getPrice());
                results.add(result);
            }
            model.addAttribute("results",results);
            return "/pages/user/myorders.html";        }
        else {
            return "redirect:/customer/login";
        }
    }


    public String refund(HttpServletRequest request) throws AlipayApiException {
        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();

        AlipayTradeRefundModel model=new AlipayTradeRefundModel();
        HttpSession session = request.getSession();
        String orderNo = (String)session.getAttribute("orderNo");
        String amount = (String)session.getAttribute("refundSum");
        session.removeAttribute("orderNo");
        session.removeAttribute("refundSum");
        // 商户订单号
        model.setOutTradeNo(orderNo);
        // 退款金额
        model.setRefundAmount(amount);
        // 退款原因
        model.setRefundReason("无理由退货");
        // 退款订单号(同一个订单可以分多次部分退款，当分多次时必传)
        model.setOutRequestNo(UUID.randomUUID().toString());
        alipayRequest.setBizModel(model);

        AlipayTradeRefundResponse alipayResponse = alipayClient.execute(alipayRequest);
        System.out.println(alipayResponse.getBody());

        return alipayResponse.getBody();
    }
}
