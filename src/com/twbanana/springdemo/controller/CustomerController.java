package com.twbanana.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping("/view")
	public String listCustomers(Model model) {
		
		return "list-customer";
	}
}
