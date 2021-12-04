package com.complaint;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.complaint.entity.Customer;
import com.complaint.entity.Login;
import com.complaint.entity.Role;
import com.complaint.service.CustomerService;

@SpringBootApplication
public class ComplaintsystemApplication implements CommandLineRunner {

	@Autowired
	private CustomerService customerService;
	public static void main(String[] args) {
		SpringApplication.run(ComplaintsystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	System.out.println(" Starting code ....");
	
  /*  Customer customer = new Customer();
	
	customer.setFirstName("Amit");
	customer.setLastName("Langore");
	customer.setUserName("amitlangore");
	customer.setPassword("amit");
	customer.setPhone("23145678");
	customer.setPincode("414001");
		
	
	Role role1 = new Role();
	role1.setRoleId(44L);
	role1.setRoleName("Customer");
	
	
	Set<Login> loginSet = new HashSet<>();
	Login login = new Login();
	login.setRole(role1);
	login.setCustomer(customer);
	loginSet.add(login);
	
	Customer customer1 = this.customerService.createCustomer(customer, loginSet);
	System.out.println(customer1.getUserName()); */
	
	}

}
