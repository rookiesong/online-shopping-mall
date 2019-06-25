package net.suncaper.demo.controller;

import net.suncaper.demo.domain.customer;
import net.suncaper.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestUserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "/api/user")
    public List<customer> ListAllCustomer(){
        return userService.findUser(null);
    }
}
