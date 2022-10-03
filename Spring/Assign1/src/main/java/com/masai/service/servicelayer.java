package com.masai.service;

import java.util.List;

import com.masai.Exception.BookNotFound;
import com.masai.model.Book;



public interface servicelayer {
	
	public List<Book> getallBook() throws BookNotFound;
	
	public Book getBookBID(Integer bookid) throws BookNotFound;
	
	public Book addBook(Book book) throws BookNotFound;
	
	public boolean deleteBook(Integer id);
	
	public Book updateBook(Book book,Integer id) throws BookNotFound;

}
//public Department addEmployee(Department employee);
//
//public Employee updateEmployee(Employee employee, Integer id) ;
//
//public boolean deleteEmployee(Integer id);
//
//public List<Employee> getallEmployee();
//
//public List<Employee> employeebyDepartment(Integer deptid);