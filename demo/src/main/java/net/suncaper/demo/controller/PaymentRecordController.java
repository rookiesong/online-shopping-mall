package net.suncaper.demo.controller;


import net.suncaper.demo.domain.Orders;
import net.suncaper.demo.service.OrdersService;
import net.suncaper.demo.service.PaymentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/paymentrecord")
public class PaymentRecordController {
    @Autowired
    private PaymentRecordService paymentRecordService;
    @Autowired
    private OrdersService ordersService;

    @GetMapping("/payAll")
    public String addPaymentRecord(HttpServletRequest request){
        HttpSession session = request.getSession();
        String recordId = (String)session.getAttribute("orderNo");
        List<Orders> ordersList = (List<Orders>) session.getAttribute("ordersList");
        for (Orders orders:ordersList
             ) {
            Timestamp build_day = new Timestamp(System.currentTimeMillis());
            paymentRecordService.addPaymentRecord(recordId,orders.getOrdersId(),"alipay",orders.getNumber()*orders.getPrice(),build_day.toString());
            ordersService.editOrder(orders.getOrdersId(),"paied");
        }
        session.removeAttribute("orderNo");
        session.removeAttribute("ordersList");
        session.removeAttribute("cartProducts");
        return "redirect:/orders/showOrders";
    }

    @GetMapping("/payOne")
    public String addOnePaymentRecord(HttpServletRequest request){
        HttpSession session = request.getSession();
        String recordId = (String)session.getAttribute("orderNo");
        Orders orders = (Orders) session.getAttribute("oneOrders");
        Timestamp build_day = new Timestamp(System.currentTimeMillis());
        paymentRecordService.addPaymentRecord(recordId,orders.getOrdersId(),"alipay",orders.getNumber()*orders.getPrice(),build_day.toString());
        ordersService.editOrder(orders.getOrdersId(),"paied");

        session.removeAttribute("orderNo");
        return "redirect:/orders/showOrders";
    }

}
