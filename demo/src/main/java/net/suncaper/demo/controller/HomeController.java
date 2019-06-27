package net.suncaper.demo.controller;

import net.suncaper.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static net.suncaper.demo.controller.UserController.getCookieByName;


@Controller
public class HomeController {
    @GetMapping("/home")
    public String getHomePage(HttpServletRequest request) {
        Cookie[] cookies =  request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                    System.out.println(cookie.getValue());
            }
        }
        return "/pages/index.html";
    }

    @GetMapping("/shopping-cart")
    public String getShoppingCart(HttpServletRequest request){
//        if(getCookieByName(request,"userMailAddress") != null) {
//            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
//            return "/pages/user/Personal-center.html";
//        }
//        else
//            return "redirect:/home";
        return "/pages/shoppingcart.html";
    }

}