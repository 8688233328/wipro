package com.wipro.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.user.entity.Customer;
import com.wipro.user.exception.ResourceNotFoundException;
import com.wipro.user.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customer")
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
    public ResponseEntity<?> fetchCustomerDetails(@PathVariable("id") int customerId) {
        try {
            // Try to fetch the customer details by ID
            Customer customer = customerService.getCustomerById(customerId);            
            // If customer found, return it with a 200 OK status
            return new ResponseEntity<>(customer, HttpStatus.OK);
        } catch (ResourceNotFoundException ex) {
            // If customer not found, handle the exception
            // Return a 404 Not Found response with a custom error message
            return new ResponseEntity<>("Customer not found", HttpStatus.NOT_FOUND);
        } catch (Exception ex) {
            // If any other unexpected error occurs, handle it
            // Return a 500 Internal Server Error response with a generic error message
            return new ResponseEntity<>("An error occurred", HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
