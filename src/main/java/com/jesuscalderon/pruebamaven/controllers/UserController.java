package com.jesuscalderon.pruebamaven.controllers;

import com.jesuscalderon.pruebamaven.entities.User;
import com.jesuscalderon.pruebamaven.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository repository;


    @GetMapping("/users")
    public List<User> allPersons(){
        return repository.findAll();
    }

    @GetMapping("/user/{name}")
    public List<User> findByName(@PathVariable("name") String name) {
        return repository.findByName(name);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return repository.save(user);
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable int id ,@RequestBody User user) {
        return repository.save(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }
}
