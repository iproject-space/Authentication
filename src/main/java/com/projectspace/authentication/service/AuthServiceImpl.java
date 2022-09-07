package com.projectspace.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectspace.authentication.entities.Credentials;
import com.projectspace.authentication.entities.User;
import com.projectspace.authentication.repository.CredentialsRepository;

@Service
public class AuthServiceImpl implements AuthService{
	
	@Autowired
	private CredentialsRepository credRepository;

	@Override
	public User authenticate(Credentials credentials) {
		
		User user = credRepository.findByEmailAndPassword(credentials.getEmail(), credentials.getPassword());
		if(user != null) 
			return user; 
		else
			return null;
	}


	
}
