package com.wipro.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.customer.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
