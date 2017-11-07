package com.miku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.miku.model.UserEntity;
import com.miku.repository.UserRepository;

@Controller()
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("getUserById")
	@ResponseBody
    public UserEntity getUserById(Long id) {
		UserEntity u = userRepository.findOne(id);
		System.out.println("userRepository: " + userRepository);
		System.out.println("id: " + id);
        return u;
    }
}
