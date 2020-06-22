package com.twbanana.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.twbanana.springdemo.dao.CustomerDAO;
import com.twbanana.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject the customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	
	
	@RequestMapping("/view")
	public String listCustomers(Model model) {
		
		// get customers from the dao
		List<Customer> customers = customerDAO.getCustomers();
		
		
		// add the customers to the model
		model.addAttribute("customers", customers);
		
		
		
		return "list-customer";
	}
}
