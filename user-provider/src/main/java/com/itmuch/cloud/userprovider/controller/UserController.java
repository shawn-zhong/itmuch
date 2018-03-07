package com.itmuch.cloud.userprovider.controller;

import com.itmuch.cloud.userprovider.dao.UserRepository;
import com.itmuch.cloud.userprovider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findById(id).orElse(new User());
        {
            return findOne;
        }
    }

}
