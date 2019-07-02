package net.suncaper.demo.controller;

import net.suncaper.demo.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static net.suncaper.demo.controller.UserController.getCookieByName;

@Controller
@RequestMapping("/delivery")
public class DeliveryAddressController {
    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @GetMapping("/addressPage")
    public String addressPage(HttpServletRequest request,Model model){
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            model.addAttribute("deliveryAddresses",deliveryAddressService.findDeliveryAddress(userMailaddress));
            return "/pages/user/Address-list.html";        }
        else {
            return "redirect:/customer/login";
        }
    }

    @PostMapping("/addAddress")
    @ResponseBody
    public Map<String, String> addAddress(@RequestParam(value = "name")String name,@RequestParam(value = "address") String address,@RequestParam(value = "user_phone")String user_phone, HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            map.put("status", deliveryAddressService.addDeliveryAddress(name,userMailaddress,address,user_phone));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @PostMapping("/deleteAddress")
    @ResponseBody
    public Map<String,String> deleteAddress(@RequestParam(value = "id")int id, HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            map.put("status",deliveryAddressService.deleteDeliveryAddress(id));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @PostMapping("/editAddress")
    @ResponseBody
    public Map<String,String> editAddress(@RequestParam(value = "id") int id,@RequestParam(value = "name")String name,@RequestParam(value = "address") String address,@RequestParam(value = "user_phone")String user_phone,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            deliveryAddressService.deleteDeliveryAddress(id);
            map.put("status",deliveryAddressService.addDeliveryAddress(name,userMailaddress,address,user_phone));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @GetMapping("/showAddress")
    @ResponseBody
    public Map<String,String> showAddress(HttpServletRequest request,Model model){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            model.addAttribute("addresses",deliveryAddressService.findDeliveryAddress(userMailaddress));
            map.put("status","ok");
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }


}
