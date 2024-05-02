package com.wipro.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.user.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
