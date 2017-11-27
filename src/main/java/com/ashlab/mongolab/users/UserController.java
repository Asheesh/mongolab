package com.ashlab.mongolab.users;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void create(@RequestBody User user){
        userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User read(@PathVariable String id){
        return userRepository.findOne(id);
    }

    @GetMapping
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @PutMapping
    public void update (@RequestBody User user){
        userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        userRepository.delete(id);
    }

}
