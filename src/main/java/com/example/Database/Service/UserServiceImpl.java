package com.example.Database.Service;

import com.example.Database.Entities.User;
import com.example.Database.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> userList() {
        return userRepo.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepo.getById(id);
    }

    @Override
    public User saveUser(User user) {
        return userRepo.saveAndFlush(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User model = userRepo.getById(id);
        model=userRepo.save(user);
        return model;
    }

    @Override
    public boolean deleteUser(Long id) {
        userRepo.deleteById(id);
        return  true;
    }

}
