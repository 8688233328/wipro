package com.wipro.orderservice.model;

import java.time.LocalDate;



import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Medicine {
	
	private int medieId;
	 private String mediName;
	 private double mediPrice;
	 private LocalDate mfd;
	 private LocalDate efd;
	 private String description;
	
	 
}
