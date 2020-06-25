package com.twbanana.springdemo.dao;

import java.util.List;

import com.twbanana.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);
}
