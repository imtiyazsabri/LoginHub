package com.loginhub.main.services;

import com.loginhub.main.entities.User;

public interface UserService {
	public boolean registerUser(User user);
	public User loginUser(String email, String password);
}
