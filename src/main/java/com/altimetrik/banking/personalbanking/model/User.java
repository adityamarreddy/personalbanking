package com.altimetrik.banking.personalbanking.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity(name="user")
public class User {
	
	@Id
	private int Id;
	@Column(name="username")
	private String username;
	@Column(name="last_login_date_time")
	private LocalDateTime lastLoginDateTime;
	@Column(name="available_balance")
	private Float availableBalance;

}
