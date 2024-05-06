package com.wipro.user.entity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Customer extends User {
	@Pattern(regexp = "^[a-zA-Z]{4,12}$", message = "Only Alphabhet are allowed")
	private String firstName;
	@Pattern(regexp = "^[a-zA-Z]{4,12}$", message = "Only Alphabhet are allowed")
	private String lastName;
	@NotNull
	private String address;
	@Pattern(regexp = "^[a-zA-Z]{4,12}$", message = "Only Alphabhet are allowed")
	private String email;
	@Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$", message = "Invalid mobile number")
	private String mobile;

	
}
