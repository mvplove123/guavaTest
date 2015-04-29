package com.tyb.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyb.model.User;
import com.tyb.service.UserService;

@Controller
@RequestMapping("user")
public class UserServiceController {
    
    @Resource
    private UserService userService;
    
    @RequestMapping(value = "insertUserList",method=RequestMethod.GET)
    public void insertUser(@RequestParam(value = "username", required = false) String username){

        System.out.println(username);
        User user = new User();
        user.setId(1);
        user.setUser_name("陶永波");
        user.setAge(27);
        user.setAddress("小南庄29号");
        userService.insertUser(user);
        
    }
    
    

}
