package com.Masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Masai.Exceptions.EmployeeNotFound;
import com.Masai.Model.Employee;
import com.Masai.Service.EmployeeServiceIMPL;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceIMPL eservice;
	
	@GetMapping("/{pageN}/{pageS}/{sortBy}/{sortDir}")
	public ResponseEntity<List<Employee>> getAllEmployee(@PathVariable int pageN, @PathVariable int pageS,@PathVariable String sortBy,@PathVariable String sortDir) throws EmployeeNotFound {
		return new ResponseEntity<List<Employee>>(eservice.getAllEmployee(pageN, pageS, sortBy, sortDir),	HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") int id) throws EmployeeNotFound {
		return new ResponseEntity<Employee>(eservice.getEmployeeByID(id),	HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) throws EmployeeNotFound {
		return new ResponseEntity<Employee>(eservice.addEmployee(emp),	HttpStatus.CREATED);}
	
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp,@PathVariable("id") int id) throws EmployeeNotFound {
		return new ResponseEntity<Employee>(eservice.updateEmployeeyID(id,emp),	HttpStatus.OK);}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteEmployee(@PathVariable int id) throws EmployeeNotFound {
		return new ResponseEntity<Boolean>(eservice.deleteEmployee(id),	HttpStatus.OK);}

}
