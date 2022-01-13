package com.example.Database.Service;

import com.example.Database.Entities.User;

import java.util.List;

public interface UserService {
    List<User> userList();
    User getById(Long id);
    User saveUser(User user);
    User updateUser(Long id , User user);
    boolean deleteUser(Long id);
}
