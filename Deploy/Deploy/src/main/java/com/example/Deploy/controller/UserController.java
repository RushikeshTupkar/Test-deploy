package com.example.Deploy.controller;

import com.example.Deploy.model.Users;
import com.example.Deploy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users user){
        return userService.addUser(user);
    }

    @GetMapping("/getAll")
    public List<Users> getAll(){
        return userService.getAll();
    }
}
