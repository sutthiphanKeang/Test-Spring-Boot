package com.example.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class UserController {
//    @Autowired
//    TestRepository repository;
//
//    @GetMapping("/user")
//    Collection<User> user(){
//        return repository.findAll();
//    }
}
