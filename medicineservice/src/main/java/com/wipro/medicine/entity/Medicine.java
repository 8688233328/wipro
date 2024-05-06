package com.wipro.medicine.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "medicine_tbl")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" }) // Ignore Hibernate-specific properties
@Data
@Getter
@Setter
public class Medicine {

	@Id
	@Column(name = "medi_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int medieId;

	@Column(name = "medi_name", length = 20)
	@Pattern(regexp = "^[a-zA-Z]{4,12}$", message = "Only Alphabhet are allowed")
	private String mediName;

	@Column(name = "medi_price")
	private double mediPrice;

	@Column(name = "medi_mfd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Past(message = "Manufacture date must be in the past")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate mfd;

	@Column(name = "medi_efd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Future(message = "Expiration date must be in the future")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate efd;

	@Column(name = "medi_des", length = 20)
	@NotNull
	private String description;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	
}
