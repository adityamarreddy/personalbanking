package com.altimetrik.banking.personalbanking.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.banking.personalbanking.model.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepostory;

	public String getActivity() {
		User user = userRepostory.getOne(123);
		String userDetails = user.toString();
		user.setLastLoginDateTime(LocalDateTime.now());
		userRepostory.save(user);
		return userDetails;
	}

}
