package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import com.example.demo.repo.FakeRepoInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTests {

    private UserService userService;
    private FakeRepoInterface fakeRepo;

    private long testId;

    @BeforeEach
    public void setup() {
        fakeRepo = new FakeRepo();
        userService = new UserServiceImpl(fakeRepo);
    }

    @Test
    public void testAddUser() {
        userService.addUser("Lebo", "Mokoena");
        // No assertion for now, just check console
    }

    @Test
    public void testGetUser() {
        long id = System.currentTimeMillis();
        fakeRepo.insertUser(id, "Thabo", "Nkosi");
        userService.getUser(id);
    }

    @Test
    public void testRemoveUser() {
        long id = System.currentTimeMillis();
        fakeRepo.insertUser(id, "Zanele", "Ndlovu");
        userService.removeUser(id);
    }
}
