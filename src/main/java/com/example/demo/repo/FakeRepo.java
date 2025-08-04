package com.example.demo.repo;

import com.example.demo.model.User;

public class FakeRepo implements FakeRepoInterface {

    private User[] users;
    private int count;

    public FakeRepo() {
        users = new User[10]; // Initial array size
        count = 0;
    }

    @Override
    public String insertUser(long id, String name, String surname) {
        if (count >= users.length) {
            // Resize array if full
            User[] newUsers = new User[users.length * 2];
            System.arraycopy(users, 0, newUsers, 0, users.length);
            users = newUsers;
        }
        users[count++] = new User(id, name, surname);
        return name;
    }

    @Override
    public String findUserById(long id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                return users[i].getName() + " " + users[i].getSurname();
            }
        }
        return null;
    }

    @Override
    public String deleteUser(long id) {
        for (int i = 0; i < cou
