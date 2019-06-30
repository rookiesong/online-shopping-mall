package net.suncaper.demo.controller;

import net.suncaper.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class PaymentContoller {
    @Autowired
    private PaymentService paymentService;


}
