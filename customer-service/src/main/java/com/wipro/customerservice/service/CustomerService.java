package com.wipro.customerservice.service;

import java.util.List;

import com.wipro.customerservice.entity.Customer;

public interface CustomerService {
	 Customer saveCustomer(Customer customer);
	  
	  Customer getCustomerById(int customerId);
	  
	  List<Customer> getAllCustomers();
	 
}