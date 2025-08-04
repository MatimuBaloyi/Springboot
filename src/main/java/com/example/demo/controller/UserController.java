package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Add user: http://localhost:8080/users/add?name=John&surname=Doe
    @PostMapping("/add")
    public String addUser(@RequestParam String name, @RequestParam String surname) {
        userService.addUser(name, surname);
        return name + " " + surname + " added successfully!";
    }

    // Get user by ID: http://localhost:8080/users/get?id=1691234567890
    @GetMapping("/get")
    public String getUser(@RequestParam long id) {
        userService.getUser(id);
        return "Check console for output.";
    }

    // Delete user by ID: http://localhost:8080/users/delete?id=1691234567890
    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam long id) {
        userService.removeUser(id);
        return "If user existed, they were removed. Check console.";
    }
}
