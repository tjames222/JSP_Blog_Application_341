package com.blog.business;

import org.springframework.stereotype.Service;

import com.blog.model.User;

@Service
public class RegistrationService {

	public void registering(User user) {
		System.out.println("Registering user: " + user.toString());
	}
}
