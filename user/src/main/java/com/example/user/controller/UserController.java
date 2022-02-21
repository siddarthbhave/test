package com.example.user.controller;


import com.example.user.VO.ResponseTemplateVO;
import com.example.user.entity.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/doctor")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithVisa(@PathVariable("id") Long doctorId) {
        return userService.getUserWithVisa(doctorId);
    }

    @GetMapping("/getall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") Long doctorId) {
        userService.delete(doctorId);
        return "User Deleted";
    }
}