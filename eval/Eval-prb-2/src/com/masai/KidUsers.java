package com.masai;

public class KidUsers implements LibraryUser{	private int age;
private String book;



@Override
public void registerAccount(Integer age) {
	if(age<12)
		System.out.println("You have successfully registered under an Kids Account");
	else
		System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	
}

@Override
public void requestBook(String book) {
	if(book.equalsIgnoreCase("Kids"))
		System.out.println("Book Issued successfully, please return the book within 10 days");
	else
		System.out.println("Oops, you are allowed to take only kids books");
	
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getBook() {
	return book;
}

public void setBook(String book) {
	this.book = book;
}

public KidUsers(int age, String book) {
	super();
	this.age = age;
	this.book = book;
}

public KidUsers() {
	super();
}


}
