package com.example.demo.services;

import com.example.demo.modele.User;

import java.util.List;

public interface UserServiceInfo {
    public User getOneUser(String email);
    public  User addUser(User user);
    public List<User>getALLUser();
    public User getUser(Long id);
}
