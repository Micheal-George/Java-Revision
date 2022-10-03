package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.BookNotFound;
import com.masai.model.Book;
import com.masai.repository.BookDAO;

@Service
public class servicelayerIMPL implements servicelayer{
	
	@Autowired
	BookDAO bookdao;

	@Override
	public List<Book> getallBook() throws BookNotFound  {
		List<Book> books=bookdao.findAll();
		if(books.size()!=0)
		{
			return books;
		}
		
		throw new BookNotFound("No Books ");
	}

	@Override
	public Book getBookBID(Integer bookid) throws BookNotFound {
		Optional<Book> book=bookdao.findById(bookid);
		if(book.isPresent())
			return book.get();
		
		throw new BookNotFound("Book not found ");
	}

	@Override
	public Book addBook(Book book) throws BookNotFound {
		// TODO Auto-generated method stub
		Book addbook=bookdao.getBookByName(book.getName());
		if(addbook==null)
		{
			return bookdao.save(book);
		}
		throw new BookNotFound("Book already present ");
	}

	@Override
	public boolean deleteBook(Integer id) {
		Optional<Book> book=bookdao.findById(id);
		if(book.isPresent())
		{
			bookdao.delete(book.get());
			return true;
		}
		
		return false;
	}

	@Override
	public Book updateBook(Book book, Integer id) throws BookNotFound {
		// TODO Auto-generated method stub
		Optional<Book> updatebook=bookdao.findById(id);
		if(updatebook.isPresent())
		{   Book exist=updatebook.get();
			if(book.getName()!=null)
			    exist.setName(book.getName());
		    if(book.getAuthor() !=null)
		    	 exist.setAuthor(book.getAuthor());
		     if(book.getCategory() !=null)
			     exist.setCategory(book.getCategory());
			   if(book.getPublication() !=null)
				   exist.setPublication(book.getPublication());
			 if(book.getPages() !=0)
				 exist.setPages(book.getPages());
				 if(book.getPrice() !=0)
				exist.setPrice(book.getPrice());
					 
			return bookdao.save(exist);
		}
		throw new BookNotFound("Book not found ");
	}
	
	

}
