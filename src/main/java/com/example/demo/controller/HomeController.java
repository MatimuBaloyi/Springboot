package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
@RequestMapping("/")
public class HomeController {

    private final UserService userService;

    @Autowired
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("addUser")
    public String addUser(@RequestParam String name, @RequestParam String surname) {
        userService.addUser(name, surname);
        return name + " added successfully";
    }

    @GetMapping("removeUser")
    public String removeUser(@RequestParam long id) {
        userService.removeUser(id);
        return "Requested user removal";
    }

    @GetMapping("getUser")
    public String getUser(@RequestParam long id) {
        userService.getUser(id);
        return "Requested user retrieval";
    }

    @GetMapping
    public String home() {
        return "Welcome to the User Management App!";
    }
}
