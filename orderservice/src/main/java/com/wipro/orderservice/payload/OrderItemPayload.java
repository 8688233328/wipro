package com.wipro.orderservice.payload;

import jakarta.validation.constraints.Positive;

public class OrderItemPayload {
	@Positive(message = "Medicine id must be required")
	private int medieId;
	@Positive(message = "quantity must be required")
	private int quantity;
	
	public int getMedieId() {
		return medieId;
	}
	public void setMedieId(int medieId) {
		this.medieId = medieId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int qantity) {
		this.quantity = qantity;
	}	
}