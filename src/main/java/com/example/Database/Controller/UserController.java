package com.example.Database.Controller;

import com.example.Database.Entities.User;
import com.example.Database.Exception.Exceptionhandling;
import com.example.Database.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public ResponseEntity<List<User>> getList(){
        List<User> userList = userService.userList();
        return ResponseEntity.ok(userList);
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        try {
            return  userService.getById(id);
        }
        catch (Exception ex){
           throw  new Exceptionhandling("Can Not Get User at Given Id", ex);
        }
    }
    @PostMapping("/")
    public User postUser(@RequestBody User user){
        try {
            return  userService.saveUser(user);
        }
        catch (Exception ex){
            throw  new Exceptionhandling("Can not save user", ex);
        }
    }
   @PutMapping("/{id}")
    public  User putUser(@PathVariable Long id,@RequestBody User user){
    try {
        return userService.updateUser(id,user);
    }
    catch (Exception ex){
        throw  new Exceptionhandling("Can update user", ex);
    }
}
@DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Long id){
    try {
        return userService.deleteUser(id);
    }
    catch (Exception ex){
        throw  new Exceptionhandling("Can delete user", ex);
    }
}

}
