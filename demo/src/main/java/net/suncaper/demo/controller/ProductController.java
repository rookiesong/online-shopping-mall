package net.suncaper.demo.controller;

import net.suncaper.demo.domain.Product;
import net.suncaper.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public String searchPage(String text){
        return "/pages/commodity.html";
    }

    @PostMapping("/search")
    public String search(Product product, Model model){
        return "pages/commodity.html";
    }
}
