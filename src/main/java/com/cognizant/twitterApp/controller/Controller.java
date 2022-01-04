package com.cognizant.twitterApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.twitterApp.model.User;
import com.cognizant.twitterApp.service.UserService;

@RestController
public class Controller {
	
	@Autowired
	private UserService userService;

	@GetMapping("/api/v1.0/tweets/users/all") 
    public List<User> getAllUser() { 
	   return userService.getAllUser(); 
    }
	
	@PostMapping("/api/v1.0/tweets/register")
	public boolean addUser(@RequestBody User user) {
	    System.out.println("Logg:" + user);
		return userService.insertUser(user);
	}

}
