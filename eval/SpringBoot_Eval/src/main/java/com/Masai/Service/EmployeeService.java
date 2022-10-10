package com.Masai.Service;

import java.util.List;

import com.Masai.Exceptions.EmployeeNotFound;
import com.Masai.Model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee(int pageN,int pageS, String sortBy, String sortDir) throws EmployeeNotFound;
	
	public Employee getEmployeeByID(int id) throws EmployeeNotFound;
	
	public Employee updateEmployeeyID(int id,Employee employee) throws EmployeeNotFound;
	
	public Employee addEmployee(Employee employee) throws EmployeeNotFound;
	
	public boolean deleteEmployee(int id) throws EmployeeNotFound;

}
