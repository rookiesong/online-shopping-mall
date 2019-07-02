package net.suncaper.demo.controller;

import net.suncaper.demo.domain.Orders;
import net.suncaper.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/payment")
public class PaymentContoller {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payorders")
    public String PayAtOrderPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Orders> ordersList = (List<Orders>)session.getAttribute("ordersList");
        session.setAttribute("sum",countSum(ordersList));
        return "redirect:/alipay/page/gotoPayPage";
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
