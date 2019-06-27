package net.suncaper.demo.controller;


import net.suncaper.demo.domain.User;
import net.suncaper.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

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

    @GetMapping("/getBackPassword")
    public String getBackPasswordPage(){
        return "/getbackpasswordpage";
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(User user, Model model,HttpServletResponse response){
        try {
            userService.saveUser(user);
        }catch (Exception exception){
            //model.addAttribute("text","failure");
            return "no";
        }
       // model.addAttribute("text","ok");
        Cookie cookie = new Cookie("userMailAddress",user.getUserMailaddress());  //对比入参数据
        cookie.setMaxAge(1000000);
        cookie.setPath("/");
        response.addCookie(cookie);
        return "ok";
    }


    @PostMapping("/login")
    public String login(HttpServletResponse response, User user, Model model) {
        if(userService.isExist(user.getUserMailaddress()))
        {
            String input_password = user.getPassWord();
            String input_address = user.getUserMailaddress();
            if(input_password.equals(userService.findUserByUserMailAddress(input_address).getPassWord())) {
                Cookie cookie = new Cookie("userMailAddress",user.getUserMailaddress());  //对比入参数据
                cookie.setMaxAge(1000000);
                cookie.setPath("/");
                response.addCookie(cookie);
                model.addAttribute("status","成功");
                return "redirect:/home";
            }
            else {
                model.addAttribute("status","密码错误");
                return "redirect:/customer/login";

            }
        }
        else
        {
            model.addAttribute("status","账号不存在");
            return "redirect:/customer/login";
        }

    }

}
