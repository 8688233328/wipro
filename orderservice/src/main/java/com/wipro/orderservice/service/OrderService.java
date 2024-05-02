package com.wipro.orderservice.service;

import java.util.List;

import com.wipro.orderservice.entity.Order;
import com.wipro.orderservice.model.OrderResponse;
import com.wipro.orderservice.payload.OrderItemPayload;

public interface OrderService {
	
	Order createOrder(int userId, List<OrderItemPayload> selectedMedicines);

	Order saveOrder(Order order);
	
	OrderResponse getOrderDetails(int orderId);
	
	List<OrderResponse> getAllOrders();
	
//	List<Order> getAllOrdersByCustomer(int customerId);
}