package net.suncaper.demo.controller;

import net.suncaper.demo.domain.Cart;
import net.suncaper.demo.domain.CartProduct;
import net.suncaper.demo.domain.User;
import net.suncaper.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.suncaper.demo.controller.UserController.getCookieByName;

@Controller
@RequestMapping("/cart")
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
    public Map<String, String> addToCart(@RequestParam(value = "productId") String productId, @RequestParam(value = "numProduct") int numProduct,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            cartService.addCart(userMailaddress,numProduct,productId);
            map.put("status", "ok");
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @PostMapping("/deleteCart")
    @ResponseBody
    public Map<String,String> deleteCart(@RequestParam(value = "productId") String productId,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            cartService.deleteCart(userMailaddress,productId);
            map.put("status", "ok");
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @PostMapping("/editCart")
    @ResponseBody
    public Map<String,String> editCart(@RequestParam(value = "productId") String productId,@RequestParam(value = "numProduct") int numProduct,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            cartService.editCart(userMailaddress,numProduct,productId);
            map.put("status", "ok");
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }



}
