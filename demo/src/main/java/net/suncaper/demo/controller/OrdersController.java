package net.suncaper.demo.controller;

import net.suncaper.demo.domain.Cart;
import net.suncaper.demo.service.CartService;
import net.suncaper.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import static net.suncaper.demo.controller.UserController.getCookieByName;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;


    @PostMapping("/addOrder")
    @ResponseBody
    public Map<String, String> addOrder(@RequestParam(value = "cartId") String[] cartIds, HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            map.put("status", ordersService.addOrder(cartIds,userMailaddress));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @PostMapping("/deleteOrder")
    @ResponseBody
    public Map<String,String> deleteOrder(@RequestParam(value = "ordersId") String ordersId,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            map.put("status", ordersService.deleteOrder(ordersId));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @PostMapping("/editOrder")
    @ResponseBody
    public Map<String,String> deleteOrder(@RequestParam(value = "ordersId") String ordersId,@RequestParam(value = "newStatus") String newStatus,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            map.put("status", ordersService.editOrder(ordersId,newStatus));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

}
