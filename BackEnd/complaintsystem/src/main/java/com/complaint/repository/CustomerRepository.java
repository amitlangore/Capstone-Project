package com.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complaint.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
	
	public Customer findByUserName( String username);
}
