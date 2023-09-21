package com.java.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.binding.Employee;

public interface MyCrudRepo extends JpaRepository<Employee, Serializable> {
	

}
