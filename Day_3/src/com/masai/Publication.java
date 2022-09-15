package com.masai;

public abstract class Publication {
	 int noOfPages;
	 int price;
	 String publisherName;
	public int getNoOfPages() {
		return noOfPages;
	}
	@Override
	public String toString() {
		return "Publication [noOfPages=" + noOfPages + ", price=" + price + ", publisherName=" + publisherName + "]";
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public Publication(int noOfPages, int price, String publisherName) {
		super();
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
	}
	public Publication() {
		super();
	}
	 

}
