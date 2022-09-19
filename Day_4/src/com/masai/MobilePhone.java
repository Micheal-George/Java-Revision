package com.masai;

import java.lang.*;
import java.util.*;

public class MobilePhone {
	private String myNumber;
	private List<Contact> myContacts=new ArrayList<>();
	public String getMyNumber() {
		return myNumber;
	}
	public void setMyNumber(String myNumber) {
		this.myNumber = myNumber;
	}
	public List<Contact> getMyContacts() {
		return myContacts;
	}
	public void setMyContacts(List<Contact> myContacts) {
		this.myContacts = myContacts;
	}
	
	private int findContact(String name) {
		int index=-1;
		for(Contact i:myContacts)
			{
			if(i.getName().equalsIgnoreCase(name))
			return myContacts.indexOf(i);
			}
		
		return index;
	}
	public boolean addNewContact(Contact c)
	{  
	int condition=findContact(c);
	
	if(condition==-1)
	{
		  myContacts.add(c);
			return true;
	}
		return false;
		
   	     
	}
	
	public boolean updateContact(Contact New,Contact Old)
	{  
	int condition=findContact(Old);
	
	if(condition>=0)
		{myContacts.get(condition).setName(New.getName());
		myContacts.get(condition).setPhoneNumber(New.getPhoneNumber());
		return true;
		}
	
	return false;	
	     
	}
	
	public boolean removeContact(Contact c)
	{  
	int condition=findContact(c);
	boolean flag=false;
	if(condition>=0)
		{
		 myContacts.remove(condition);
		       flag= true;
		}
	return flag;	     
	}
	
	private int findContact(Contact c) {
		for(Contact i:myContacts)
		{
			if(i.getName().equalsIgnoreCase(c.getName())&&i.getPhoneNumber().equals(c.getPhoneNumber()))
			return myContacts.indexOf(i);	
		}
		return -1;
	}
	
	public  Contact queryContact(String name) {
		int condition=findContact(name);
		boolean flag=false;
		if(condition>=0)
			return myContacts.get(condition);
			       
			
		return null;
	}
	
	public void printContacts()
	{
		for(Contact s:getMyContacts())
			System.out.println(s);	
	}

}
