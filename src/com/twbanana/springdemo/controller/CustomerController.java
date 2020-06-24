package com.twbanana.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.twbanana.springdemo.entity.Customer;
import com.twbanana.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject our customer service
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/view")
	public String listCustomers(Model model) {
		
		// get customers from the service
		List<Customer> customers = customerService.getCustomers();
		
		
		// add the customers to the model
		model.addAttribute("customers", customers);
		
		
		
		return "list-customer";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model ) {
		
		// create model attribute to bind form data
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		
		// save the customer using our service
		customerService.saveCustomer(customer);
		
		return "redirect:/customer/view";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
