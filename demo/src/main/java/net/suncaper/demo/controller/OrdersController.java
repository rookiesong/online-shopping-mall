package net.suncaper.demo.controller;

import net.suncaper.demo.domain.Cart;
import net.suncaper.demo.service.CartService;
import net.suncaper.demo.service.OrdersService;
import net.suncaper.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

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


    @GetMapping("/addOrderPage")
    public String addOrderPage(Model model,HttpServletRequest request){
        model.addAttribute("payments",paymentService.allPayment());
        return "/pages/addorderpage.html";
    }

    @PostMapping("/addOrder")
    @ResponseBody
    public Map<String,String> addOrder(@RequestParam(value = "cartIds[]") String[] cartIds,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            ordersService.addOrder(cartIds,userMailaddress);
            HttpSession httpSession = request.getSession();
            httpSession.removeAttribute("cartProducts");
            map.put("status", "ok");
            httpSession.setAttribute("cartProducts",cartService.addOrderCartProduct(cartIds));
            httpSession.setAttribute("ordersList",ordersService.addOrder(cartIds,userMailaddress));
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

    @GetMapping("/showOrders")
    @ResponseBody
    public Map<String,String> orderPage(HttpServletRequest request,Model model){
        //所有的订单
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            model.addAttribute("orders",ordersService.showOrder(userMailaddress));
            map.put("status", "ok");
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

}
