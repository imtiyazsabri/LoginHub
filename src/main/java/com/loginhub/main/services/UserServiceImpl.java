package com.loginhub.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginhub.main.entities.User;
import com.loginhub.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		
		try {
			userRepository.save(user);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public User loginUser(String email, String password) {
		// TODO Auto-generated method stub
		
		User validUser = userRepository.findByEmail(email);
		
		if(validUser != null && validUser.getPassword().equals(password)) {
			return validUser;
		}
		
		return null;
	}

}
