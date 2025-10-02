package com.loginhub.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginhub.main.entities.User;



public interface UserRepository extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}
