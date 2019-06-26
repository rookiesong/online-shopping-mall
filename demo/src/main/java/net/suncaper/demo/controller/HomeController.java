package net.suncaper.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller

public class HomeController {
    @GetMapping("/home")
    public String getHomePage() {
        return "/pages/index.html";
    }

    @GetMapping("/shopping-cart")
    public String getShoppingCart(){
        return "/pages/shopping-cart.html";
    }

}