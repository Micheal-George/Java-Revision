package com.masai;

import java.util.ArrayList;
import java.util.List;

public class Library {
	public static List<Publication> library=new ArrayList();

	

	public  void Add(Object obj)
	{   if(obj instanceof Book)
		library.add((Book)obj);
	
	else if(obj instanceof Journal)
		library.add((Journal)obj);
	}

	public Library() {
		super();
	}
	public static List<Publication> getLibrary() {
		return library;
	}

	public static void setLibrary(List<Publication> library) {
		Library.library = library;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library=new Library();
		Publication book1=new Book();
		book1.noOfPages=250;book1.price=500;book1.publisherName="Nolan";
		Publication book2=new Book();
		book2.noOfPages=350;book2.price=900;book2.publisherName="DD Basu";
		Publication book3=new Book();
		book3.noOfPages=50;book3.price=100;book3.publisherName="John c";
		
		library.Add(book1);
		library.Add(book2);
		library.Add(book3);
		
		
		Publication Journal1=new Journal();
		Journal1.noOfPages=150;Journal1.price=650;Journal1.publisherName="Mantiona";
		Publication Journal2=new Journal();
		Journal2.noOfPages=550;Journal2.price=1650;Journal2.publisherName="Melano";
		
		library.Add(Journal1);
		library.Add(Journal2);
		
		
		for(Publication p:library.getLibrary())
			  System.out.println(p);
		
	
		
	}


}
