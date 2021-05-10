package com.example.getmesocialservice.resources;

import com.example.getmesocialservice.model.User;
import com.example.getmesocialservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public User getUsers(){
        return  userService.getUsers();
    }




}
