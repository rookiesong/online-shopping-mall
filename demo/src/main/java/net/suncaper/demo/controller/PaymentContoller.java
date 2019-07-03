package net.suncaper.demo.controller;

import net.suncaper.demo.domain.Orders;
import net.suncaper.demo.service.OrdersService;
import net.suncaper.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

import static net.suncaper.demo.controller.UserController.getCookieByName;

@Controller
@RequestMapping("/payment")
public class PaymentContoller {
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private OrdersService ordersService;

    @GetMapping("/payorders")
    public String PayAtOrderPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Orders> ordersList = (List<Orders>)session.getAttribute("ordersList");
        session.setAttribute("sum",countSum(ordersList));
        return "redirect:/alipay/page/gotoPayPage";
    }
    @GetMapping("/payOneOrder")
    public String payOneOrder(HttpServletRequest request,@RequestParam(value = "ordersId") String ordersId){
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            HttpSession httpSession = request.getSession();
            Orders orders = ordersService.findOrder(ordersId);
            int sum = orders.getNumber() * orders.getPrice();
            httpSession.setAttribute("sum",sum+"");
            return "redirect:/alipay/page/gotoPayPage";        }
        else {
            return "redirect:/customer/login";
        }
    }


    public String countSum(List<Orders> ordersList){
        int sum = 0;
        for (Orders orders:ordersList
             ) {
            sum += orders.getNumber() * orders.getPrice();
        }
        return ""+sum;
    }


}
