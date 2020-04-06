package com.altimetrik.banking.personalbanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.banking.personalbanking.service.UserService;

@RestController
@RequestMapping(path = "/personalbanking")

public class PersonalBankingController {

	@Autowired
	private UserService service;

	 @GetMapping(path="/", produces = "application/json")
	 public String getUserActivity() {
		return service.getActivity();
	}
}
