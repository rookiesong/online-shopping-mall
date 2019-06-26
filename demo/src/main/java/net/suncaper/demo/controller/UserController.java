package net.suncaper.demo.controller;


import net.suncaper.demo.domain.User;
import net.suncaper.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registerPage(){
        return "/pages/user/register.html";
    }


    @GetMapping("/login")
    public String loginPage(){
        return "/pages/user/login.html";
    }

    @PostMapping("/register")
    public String register(User user){
        userService.saveUser(user);
        return "redirect:/home";
    }

    @GetMapping("/getBackPassword")
    public String getBackPasswordPage(){
        return "/getbackpasswordpage";
    }
}
