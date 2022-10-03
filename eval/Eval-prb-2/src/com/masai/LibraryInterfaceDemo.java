package com.masai;

import java.util.Scanner;

public class LibraryInterfaceDemo {
	KidUsers kids=new KidUsers();
	AdultUser adult=new AdultUser();
	
	public void applicationRegister(int age)
	{
		if(age<12)	
			kids.registerAccount(age);
		else if(age>12)
			adult.registerAccount(age);
	}

	public void applicationRequestBook(int age,String Book)
	{
		if(age<12)	
			kids.requestBook(Book);
		else if(age>12)
			adult.requestBook(Book);
	}
	public static void main(String[] args) {
		LibraryInterfaceDemo  demo=new LibraryInterfaceDemo ();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("-----------------------");
		 System.out.println("Enter Age");
		 System.out.println("-----------------------");
		 int age=sc.nextInt();
		 demo.applicationRegister(age);
		 System.out.println("-----------------------");
		 System.out.println("Enter Book Request");
		 System.out.println("-----------------------");
		 String book=sc.next();
		demo.applicationRequestBook(age, book);
		

	}

}
