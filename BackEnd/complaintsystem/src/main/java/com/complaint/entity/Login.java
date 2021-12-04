package com.complaint.entity;

import javax.persistence.*;

@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long loginId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Customer customer;
	
	@ManyToOne
	private Role role;

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Role getRole() {
		return role;
	} 

	public void setRole(Role role) {
		this.role = role;
	}

	public Login() {
		super();
	}
}
