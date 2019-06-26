package net.suncaper.demo.controller;

import net.suncaper.demo.domain.User;
import net.suncaper.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    public class RestUserController {
        @Autowired
        private UserService userService;

       /* @PostMapping( "/user/register")
        public List<User> listAllCustomers() {
            //return userService.findUser(null);
        }*/
    }


