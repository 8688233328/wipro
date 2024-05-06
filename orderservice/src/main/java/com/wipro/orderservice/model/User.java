package com.wipro.orderservice.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class User {
	
	private int userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String mobile;

	

}
