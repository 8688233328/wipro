package com.wipro.user.service;

import java.util.List;

import com.wipro.user.entity.Customer;


public interface CustomerService {
    
    Customer saveCustomer(Customer customer);
    
    Customer getCustomerById(int id);
    
    List<Customer> getAllCustomers();
    
    Customer updateCustomerr(Customer customer);
    
    void deleteCustomer(int id);
    
}
