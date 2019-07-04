package net.suncaper.demo.controller;

import net.suncaper.demo.domain.Product;
import net.suncaper.demo.domain.User;
import net.suncaper.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import static net.suncaper.demo.controller.UserController.getCookieByName;


@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/home")
    public String getHomePage(HttpServletRequest request, Model model) {
//        Cookie[] cookies =  request.getCookies();
//        if(cookies != null){
//            for(Cookie cookie : cookies){
//                    System.out.println(cookie.getValue());
//            }
//        }
        List<Product> homeRecommendlist = homeService.recommendBySale();
        model.addAttribute("homeRecommendlist",homeRecommendlist);
        return "/pages/index.html";
    }


}