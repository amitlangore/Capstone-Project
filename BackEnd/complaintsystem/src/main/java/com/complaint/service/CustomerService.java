package com.complaint.service;

import java.util.Set;

import com.complaint.entity.Customer;
import com.complaint.entity.Login;

public interface CustomerService {
	
	//Creating Customer
	public Customer createCustomer( Customer customer, Set<Login> login ) throws Exception;

	//Get Customer by username
	public Customer getCustomer(String userName);
	
	//Delete Customer by Id
	public void deleteCustomer(Long Id);

	public boolean getlogin(String userName,String password);
	
	
}
