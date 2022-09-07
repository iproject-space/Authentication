package com.projectspace.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectspace.authentication.entities.Credentials;
import com.projectspace.authentication.entities.User;
import com.projectspace.authentication.service.AuthService;

@RestController
@RequestMapping("/api/v1")
public class AuthController {
	
	@Autowired
	private AuthService loginService;
	
	@PostMapping("/auth")
	public ResponseEntity<User> authentiateUser(@RequestBody Credentials credentials){
		User user = loginService.authenticate(credentials);
		if(user != null){
			return new ResponseEntity<User>(user,HttpStatus.OK);
		} else
			return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
	}
	
//	@PostMapping("/create")
//	public ResponseEntity<> addCredentials() 
	
}
