package net.suncaper.demo.controller;

import net.suncaper.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
}
