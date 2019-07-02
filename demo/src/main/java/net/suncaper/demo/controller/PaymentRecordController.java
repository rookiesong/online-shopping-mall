package net.suncaper.demo.controller;


import net.suncaper.demo.service.PaymentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paymentrecord")
public class PaymentRecordController {
    @Autowired
    private PaymentRecordService paymentRecordService;

}
