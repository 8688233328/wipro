package com.wipro.orderservice.payload;

import java.util.ArrayList;
import java.util.List;

import jakarta.validation.constraints.Positive;

public class OrderPayload {
	@Positive(message = "User ID is  required")
	private int userId;	
	private List<OrderItemPayload> orderItems = new ArrayList<>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<OrderItemPayload> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemPayload> orderItems) {
		this.orderItems = orderItems;
	}	
}