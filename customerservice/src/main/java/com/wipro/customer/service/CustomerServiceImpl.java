package com.wipro.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.customer.entity.Customer;
import com.wipro.customer.exception.ResourceNotFoundException;
import com.wipro.customer.repository.CustomerRepository;



@Service
public class CustomerServiceImpl implements CustomerService{

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
	public Customer getCustomerById(int customerId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(customerId);
        if(optionalCustomer.isEmpty()) {
        	throw new ResourceNotFoundException("Customer not existing with id: "+customerId);
        }
        Customer customer = optionalCustomer.get();
        return customer;
	}

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

	@Override
	public Customer updateCustomerr(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}

  	
}