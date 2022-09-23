package com.masai;

public class Demo {

	public static void main(String[] args) {
		MobilePhone m=new MobilePhone();
		Contact c=new Contact();
         Integer i=5;
         i=10;
           System.out.println(i);
		m.addNewContact(c.createContact("Bob", "31415926")) ;
		m.addNewContact(c.createContact("Alice", "16180339")) ;
		m.addNewContact(c.createContact("Tom", "11235813")) ;
		m.addNewContact(c.createContact("Jane", "23571113")) ;
		m.addNewContact(c.createContact("Bob", "31415926")) ;
		
		m.removeContact(c.createContact("Alice", "16180339"));
		
		m.updateContact(c.createContact("man", "31415926"),c.createContact("Bob", "31415926")) ;
		m.printContacts();
		System.out.println(m.queryContact("tom"));;
//		System.out.println(m.updateContact(c2,c3 ));
//		
		

	}

}
