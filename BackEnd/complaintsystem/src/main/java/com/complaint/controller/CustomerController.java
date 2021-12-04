package com.complaint.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.complaint.entity.Customer;
import com.complaint.entity.Login;
import com.complaint.entity.Role;
import com.complaint.service.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/")
	public Customer createCustomer(@RequestBody Customer customer) throws Exception
	{
		Set<Login> logins = new HashSet<>();
		Role role = new Role();
		role.setRoleId(45L);
		role.setRoleName("Normal");
		
		Login login = new Login();
		login.setCustomer(customer);
		login.setRole(role);
		
		
		logins.add(login);
			
		return this.customerService.createCustomer(customer, logins);
	}
	

	@GetMapping("/login")
	public boolean getlogin(@RequestParam("username") String userName,@RequestParam("password") String password)
	{
		return this.customerService.getlogin(userName,password);
	}
	
	@GetMapping("/{userName}")
	public Customer getCustomer(@PathVariable("userName") String userName)
	{
		return this.customerService.getCustomer(userName);
	}
	
	@DeleteMapping("/{Id}")
	public void deleteCustomer(@PathVariable("Id") Long Id)
	{
		this.customerService.deleteCustomer(Id);
	}

}
