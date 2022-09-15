package com.masai;

public class Tomato implements Vegetable,Fruit{
	
	@Override
	public void hasApeel() {
		// TODO Auto-generated method stub
		System.out.println("Has a peel");
	}

	@Override
	public void hasARoot() {
		// TODO Auto-generated method stub
		System.out.println("Has a Root");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tomato t=new Tomato();
 t.hasApeel();
 t.hasARoot();
	}

	

}
