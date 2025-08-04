package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.FakeRepoInterface;

@Service
public class UserServiceImpl implements UserService {

    private final FakeRepoInterface fakeRepo;

    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public void addUser(String name, String surname) {
        long id = System.currentTimeMillis(); // simple id generator
        fakeRepo.insertUser(id, name, surname);
        System.out.println(name + " added");
    }

    @Override
    public void removeUser(long id) {
        String name = fakeRepo.deleteUser(id);
        if (name != null) {
            System.out.println(name + " removed");
        } else {
            System.out.println("User not found");
        }
    }

    @Override
    public void getUser(long id) {
        String fullName = fakeRepo.findUserById(id);
        if (fullName != null) {
            String firstName = fullName.split(" ")[0];
            System.out.println("Hello " + firstName);
        } else {
            System.out.println("User not found");
        }
    }
}
