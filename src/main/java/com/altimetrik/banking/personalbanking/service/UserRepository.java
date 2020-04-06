package com.altimetrik.banking.personalbanking.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.banking.personalbanking.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
