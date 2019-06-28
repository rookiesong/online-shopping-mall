package net.suncaper.demo.controller;

import net.suncaper.demo.domain.Product;
import net.suncaper.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    public String search(@RequestParam(value = "productName", required = false) String productName, Model model){
        List<Product> productList = productService.findProduct(productName);
        System.out.println(productName);
        model.addAttribute("products",productList);
        return "/pages/commodity.html";
    }

    @GetMapping("/detail")
    public String detailPage(@RequestParam(value = "id",required = false) String productId,Model model){
        Product product = productService.findProductById(productId);
        model.addAttribute("product",product);
        return "/pages/productdetails.html";
    }
}
