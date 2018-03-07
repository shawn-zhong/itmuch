package com.itmuch.cloud.microservicesimpleprovideruser.controller;

import com.itmuch.cloud.microservicesimpleprovideruser.dao.UserRepository;
import com.itmuch.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findOne(id) {
            return findOne;
        }
    }
}
