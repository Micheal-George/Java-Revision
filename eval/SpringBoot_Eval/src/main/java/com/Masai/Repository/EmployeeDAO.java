package com.Masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Masai.Model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

	


}
