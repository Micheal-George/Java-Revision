package com.masai;

public class Rectangle {
	private double Width;
	private double Length;
	



	public Rectangle(double width, double length) {
		super();
		if(width<0)
			Width=0;
		else
			Width = width;
		if(length<0) 
			Length=0;
		else 
		Length = length;
		
	}


	public double getWidth() {
		return Width;
	}


	public double getLength() {
		return Length;
	}

  public  double getArea() {
	  return Width*Length;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
	}

}
