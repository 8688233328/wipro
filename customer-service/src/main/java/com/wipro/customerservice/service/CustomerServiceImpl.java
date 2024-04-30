package com.wipro.customerservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.customerservice.entity.Customer;
import com.wipro.customerservice.exception.ResourceNotFoundException;
import com.wipro.customerservice.repository.CustomerRepository;



@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	  private CustomerRepository customerRepository;

	  @Override
	  public Customer saveCustomer(Customer customer) {
	    customerRepository.save(customer);
	    return customer;
	  }

	  @Override
	  public Customer getCustomerById(int customerId) {
	    Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
	    if (optionalCustomer.isEmpty()) {
	      throw new ResourceNotFoundException("Customer is not existing with id:"+customerId);
	    }
	    Customer customer = optionalCustomer.get();
	    return customer;
	  }

	  @Override
	  public List<Customer> getAllCustomers() {
	    List<Customer> customers=customerRepository.findAll();
	    return customers;
	  }
}