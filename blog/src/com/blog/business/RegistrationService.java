package com.blog.business;

import com.blog.model.User;

import org.springframework.stereotype.Service;

import com.blog.controller.BlogController;

@Service
public class RegistrationService {

	public void registering(com.blog.model.User user) {
		System.out.println("Registering user: " + user.toString());
	}
}
