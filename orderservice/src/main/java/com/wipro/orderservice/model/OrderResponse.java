package com.wipro.orderservice.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class OrderResponse {
	
	private int orderId;
	private double orderTotal;
	private LocalDate orderDate;
	private String orderStatus;
	private User user;
	private List<OrderItemResponse>orderItems;
	
	
	
	

}
