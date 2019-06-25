package net.suncaper.demo.controller;

import net.suncaper.demo.domain.customer;
import net.suncaper.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @Value("${upload.base-dir}")
    private String uploadBaseDir;

    @GetMapping("/add")
    public String addPage(Model model){
        model.addAttribute("user",new customer());
        return "/pages/user/add-users.html";
    }
    @PostMapping("/add")
    public String saveUser(customer customer, @RequestParam("file") MultipartFile file) throws IOException {
//        userService.saveCustomer(customer);
        Files.write(Paths.get(uploadBaseDir, file.getOriginalFilename()), file.getBytes());
        return "redirect:/user";
    }

    @GetMapping("/delete")
    public String deleteUserById(String id){
        userService.deleteUserById(id);
        return "redirect:/user";
    }

    @GetMapping("update")
    public String editPage(String id, Model model){
        model.addAttribute("user",userService.findUserByID(id));
        return "/pages/user/add-users.html";
    }

    @GetMapping("/{id}")
    public String deleteUser(@PathVariable("id") String id){
        return "redirect:/user";
    }


    @RequestMapping("/search")
    @ResponseBody
    public List<customer> findUsers(String name){
        return userService.findUser(name);
    }
    @RequestMapping
    public String userPage(Model model,@RequestParam(value = "name",required = false) String name){
        List<customer> users = userService.findUser(name);
        model.addAttribute("users",users);
        return  "pages/user/list.html";
    }

}
