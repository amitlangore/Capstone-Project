package com.complaint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.complaint.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
