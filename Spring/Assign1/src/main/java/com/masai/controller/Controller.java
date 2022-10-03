package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.BookNotFound;
import com.masai.model.Book;
import com.masai.service.servicelayer;

@RestController
@RequestMapping("/bookservice")
public class Controller {
	
	@Autowired
	servicelayer service;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() throws BookNotFound
	{
		return service.getallBook();
	}
	
	@GetMapping("/books/{id}")
	public Book getBookByid(@PathVariable("id") Integer id) throws BookNotFound
	{
		return service.getBookBID(id);
	}
	
	@PostMapping("/books")
	public Book addBooks(@RequestBody Book book) throws BookNotFound
	{
		return service.addBook(book);
	}
	
	 @PutMapping("/books/{id}")
	public Book updateBooks(@RequestBody Book book,@PathVariable("id") Integer id) throws BookNotFound
	{
		return service.updateBook(book, id);
	}
	 
	 @DeleteMapping("/books/{id}")
	 public boolean deleteBook(@PathVariable("id") Integer id)
	 {
		 return service.deleteBook(id);
	 }

}
