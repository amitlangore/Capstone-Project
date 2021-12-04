package com.complaint.service.implementation;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.complaint.entity.Customer;
import com.complaint.entity.Login;
import com.complaint.repository.CustomerRepository;
import com.complaint.repository.RoleRepository;
import com.complaint.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	
	//creating user
	@Override
	public Customer createCustomer(Customer customer, Set<Login> login) throws Exception {
		
		Customer local = this.customerRepository.findByUserName(customer.getUserName());
		if(local!=null)
			try {
				{
					System.out.println("Customer is already here !!!");
					throw new Exception("User already present !!!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		else {
			for( Login lg : login)
			{
				roleRepository.save(lg.getRole());
			}
			customer.getLogin().addAll(login);
			local = this.customerRepository.save(customer);
		}
		
		return local;
	}


	@Override
	public Customer getCustomer(String userName) {
		
		return this.customerRepository.findByUserName(userName);
	}


	@Override
	public void deleteCustomer(Long Id) {
		this.customerRepository.deleteById(Id);
		
	}


	@Override
	public boolean getlogin(String userName, String password) {
		// TODO Auto-generated method stub
	return true;
	}


	

}
