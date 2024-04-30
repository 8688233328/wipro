package com.wipro.customer.service;

import java.util.List;

import com.wipro.customer.entity.Customer;


public interface CustomerService {
    
    Customer saveCustomer(Customer customer);
    
    Customer getCustomerById(int id);
    
    List<Customer> getAllCustomers();
    
    Customer updateCustomerr(Customer customer);
    
    void deleteCustomer(int id);
    
}
