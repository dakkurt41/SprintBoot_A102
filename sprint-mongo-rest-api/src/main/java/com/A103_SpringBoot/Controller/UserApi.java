package com.A103_SpringBoot.Controller;

import com.A103_SpringBoot.Entity.User;
import com.A103_SpringBoot.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void init(){
        User user = new User();
        user.setFirstName("Mike");
        user.setLastName("Duman");
        userRepository.save(user);

    }


    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> addUser(){
        return ResponseEntity.ok(userRepository.findAll());
    }

}
