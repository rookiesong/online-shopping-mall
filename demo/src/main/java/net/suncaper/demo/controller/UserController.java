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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

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
        return "/pages/user/getbackpasswordpage";
    }

    @GetMapping("/center")
    public String personalCenter(HttpServletRequest request,Model model){

        if(getCookieByName(request,"userMailAddress") != null) {
            String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
            User user = userService.findUserByUserMailAddress(userMailaddress);
            model.addAttribute("user",user);
            return "/pages/user/Personal-center.html";
        }
        else
            return "redirect:/home";
    }

    @PostMapping("/center")
    public String editCenter(HttpServletRequest request,User user){
        String userMailaddress = getCookieByName(request,"userMailAddress").getValue();
        user.setUserMailaddress(userMailaddress);
        userService.editUser(user);
        return "redirect:/customer/center";
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(User user, Model model,HttpServletResponse response){
        try {
            userService.saveUser(user);
        }catch (Exception exception){
            return "no";
        }
        Cookie cookie = new Cookie("userMailAddress",user.getUserMailaddress());  //对比入参数据
        cookie.setMaxAge(1000000);
        cookie.setPath("/");
        response.addCookie(cookie);
        return "ok";
    }


    @PostMapping("/login")
    @ResponseBody
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
                return "1";
            }
            else {
                model.addAttribute("status","密码错误");
                return "2";

            }
        }
        else
        {
            model.addAttribute("status","账号不存在");
            return "3";
        }

    }

    /**
     * 根据名字获取cookie
     * @paramrequest
     * @paramname cookie名字
     * @return
     */
    public static Cookie getCookieByName(HttpServletRequest request,String name){
        Map<String,Cookie> cookieMap = ReadCookieMap(request);
        if(cookieMap.containsKey(name)){
            Cookie cookie = (Cookie)cookieMap.get(name);
            return cookie;
        }else{
            return null;
        }
    }



    /**
     * 将cookie封装到Map里面
     * @paramrequest
     * @return
     */
    private static Map<String,Cookie> ReadCookieMap(HttpServletRequest request){
        Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
        Cookie[] cookies = request.getCookies();
        if(null!=cookies){
            for(Cookie cookie : cookies){
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }

}
