package net.suncaper.demo.controller;

import net.suncaper.demo.domain.CartProduct;
import net.suncaper.demo.domain.User;
import net.suncaper.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import static net.suncaper.demo.controller.UserController.getCookieByName;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/shopping-cart")
    public String CartPage(HttpServletRequest request,Model model){

        if(getCookieByName(request,"userMailAddress") != null) {
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            List<CartProduct> cartProducts = cartService.returnCartProduct(userMailaddress);
            model.addAttribute("cartProducts",cartProducts);
//            User user = userService.findUserByUserMailAddress(userMailaddress);
//            model.addAttribute("user",user);
            return "/pages/shoppingcart.html";
        }
        else
            return "redirect:/customer/login";
    }

    @PostMapping("/addCart")
    @ResponseBody
    public String addToCart(HttpServletRequest request, @RequestParam(value = "numProduct") int number,@RequestParam(value = "productId") String productId){
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            cartService.addCart(userMailaddress,number,productId);
            return "ok";
        }
        else
            return "no";
    }
}
