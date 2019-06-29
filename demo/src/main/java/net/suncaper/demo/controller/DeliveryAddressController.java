package net.suncaper.demo.controller;

import net.suncaper.demo.service.DeliveryAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static net.suncaper.demo.controller.UserController.getCookieByName;

@Controller
@RequestMapping("/delivery")
public class DeliveryAddressController {
    @Autowired
    private DeliveryAddressService deliveryAddressService;

    @PostMapping("/addAddress")
    @ResponseBody
    public Map<String, String> addAddress(@RequestParam(value = "address") String address, HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            map.put("status", deliveryAddressService.addDeliveryAddress(userMailaddress,address));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @PostMapping("/deleteAddress")
    @ResponseBody
    public Map<String,String> deleteCart(@RequestParam(value = "address") String address,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            map.put("status",deliveryAddressService.deleteDeliveryAddress(userMailaddress,address));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }

    @PostMapping("/editAddress")
    @ResponseBody
    public Map<String,String> editCart(@RequestParam(value = "address") String address,HttpServletRequest request){
        Map<String, String> map = new HashMap<String, String>();
        if(getCookieByName(request,"userMailAddress") != null){
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            deliveryAddressService.deleteDeliveryAddress(userMailaddress,address);
            map.put("status",deliveryAddressService.addDeliveryAddress(userMailaddress,address));
            return map;        }
        else {
            map.put("status","no");
            return map;
        }
    }


}
