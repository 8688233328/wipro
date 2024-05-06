package com.wipro.orderservice.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderItemResponse {

	private int orderItemId;
	private int quantity;
	private Medicine medicine;
	private double itemTotal;

}
