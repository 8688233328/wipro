package com.wipro.user.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wipro.user.entity.Customer;
import com.wipro.user.exception.ResourceNotFoundException;
import com.wipro.user.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

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
	public Customer getCustomerById(int userId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(userId);
		if (optionalCustomer.isEmpty()) {
			throw new ResourceNotFoundException("Customer not existing with id: " + userId);
		}
		Customer customer = optionalCustomer.get();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Optional<Customer> optionalMedicine = customerRepository.findById(customer.getUserId());
		if (optionalMedicine.isEmpty()) {
			throw new ResourceNotFoundException("Customer not existing with id: " + customer.getUserId());
		}
		customerRepository.save(customer);
		return customer;
	}

	@Override
	public void deleteCustomer(int userId) {
		Optional<Customer> optionalCustomer = customerRepository.findById(userId);
		if (optionalCustomer.isEmpty()) {
			throw new ResourceNotFoundException("Customer not existing with id: " + userId);
		}
		Customer customer = optionalCustomer.get();
		customerRepository.delete(customer);
	}

}