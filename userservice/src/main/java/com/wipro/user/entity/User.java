package com.wipro.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Data
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int userId;

	@NotBlank(message = "Username is required")
	@Column(nullable = false, unique = true)
	private String username;

	@NotBlank(message = "Password is required")
	@Column(nullable = false)
	private String password;

	

}
