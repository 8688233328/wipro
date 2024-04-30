package com.wipro.customer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.customer.entity.Customer;
import com.wipro.customer.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
	public ResponseEntity<Customer> fetchUserDetails(@PathVariable("id") int customerId) {
		Customer customer = customerService.getCustomerById(customerId);
			return new ResponseEntity<>(customer,HttpStatus.OK);
	}

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
        List<Customer> customers = customerService.getAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

	/*
	 * @PutMapping("/update") public ResponseEntity<User> editUser(@RequestBody User
	 * user) { userService.updateUser(user); ResponseEntity<User> responseEntity =
	 * new ResponseEntity<>(user,HttpStatus.OK); return responseEntity; }
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<Void>
	 * deleteUser(@PathVariable("id") int userId) { userService.deleteUser(userId);
	 * ResponseEntity<Void> responseEntity = new ResponseEntity<>(HttpStatus.OK);
	 * return responseEntity; }
	 */

	/*
	 * @PostMapping("/admin") public Admin createAdmin(@RequestBody Admin admin) {
	 * return (Admin) userService.saveUser(admin); }
	 */
	   
}
