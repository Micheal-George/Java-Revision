package com.masai;

import java.util.Scanner;

public class InsideCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   int x1=0;
		   int y1=0;
		   float radius=10;
		      System.out.println("enter x2 :");
		    
		   int x2 = sc.nextInt();
		    System.out.println("enter y2 :");

		      int y2 = sc.nextInt();
		   double distance;

		   distance=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
		   
		   if(distance > radius)
		        System.out.println(x2+" "+y2 +" co-ordinates lies outside the circle");
		      else if(distance < radius)
		        System.out.println(x2+" "+y2 +" co-ordinates lies inside the circle");
		      else if(distance == radius)
		        System.out.println(x2+" "+y2 +" co-ordinates lies on boundary of the circle");
		       else
		        System.out.println("Wrong Entry");

	}

}
