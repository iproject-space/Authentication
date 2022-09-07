package com.projectspace.authentication.service;

import com.projectspace.authentication.entities.Credentials;
import com.projectspace.authentication.entities.User;

public interface AuthService {
	public User authenticate(Credentials credentials); 
}
