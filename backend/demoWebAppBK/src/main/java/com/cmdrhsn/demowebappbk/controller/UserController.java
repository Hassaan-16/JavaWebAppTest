package com.cmdrhsn.demowebappbk.controller;

import com.cmdrhsn.demowebappbk.entity.User;
import com.cmdrhsn.demowebappbk.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController  // Marks this as a REST API controller
@RequestMapping("/api/users")  // Base URL for all endpoints in this class
public class UserController {

    @Autowired  // Injects the UserRepository (dependency injection)
    private UserRepository userRepository;

    // GET all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();  // Uses the repository to fetch data
    }

    // POST a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);  // Saves the user to the database
    }
}