package com.masai;

public class Contact {
	private String name;
	private String phoneNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Contact createContact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		
		return new Contact(this.name,this.phoneNumber);
	}
	public Contact() {
		super();
	}
	
	
public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
@Override
	public String toString() {
		return name + "- >" + phoneNumber;
	}

}
