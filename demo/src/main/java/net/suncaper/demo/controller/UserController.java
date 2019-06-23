package net.suncaper.demo.controller;

import net.suncaper.demo.domain.customer;
import net.suncaper.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public String userPage(){
        return "/pages/user/add-users.html";
    }
    @PostMapping("/add")
    public String saveUser(customer customer){
        userService.saveCustomer(customer);
        return "redirect:/user";
    }

    @GetMapping("/delete")
    public String deleteUserById(String id){
        userService.deleteUserById(id);
        return "redirect:/user";
    }
    @RequestMapping("/search")
    @ResponseBody
    public List<customer> findUsers(){
        return userService.findUser();
    }
    @RequestMapping
    public String userPage(Model model){
        List<customer> users = userService.findUser();
        model.addAttribute("users",users);
        return  "pages/user/list.html";
    }

}
