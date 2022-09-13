package com.masai;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CompareTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s3 = "Value1";
		  String s2 = "Value2";
		  LocalTime before = LocalTime.now();
		  for (int i = 0; i < 100000; ++i) {
		   s3 = s3 + s2;
		  }
		  LocalTime after = LocalTime.now();
		  long diff = ChronoUnit.MILLIS.between(before, after);
		  System.out.println("Using String");
		  System.out.println("Time taken in miliseconds : " + diff);

		  StringBuffer s4 = new StringBuffer("Value1");
		  before = LocalTime.now();
		  for (int i = 0; i < 100000; ++i) {
		   s4.append(s2);
		  }
		  after = LocalTime.now();
		  diff = ChronoUnit.MILLIS.between(before, after);
		  System.out.println("Using StringBuffer");
		  System.out.println("Time taken in miliseconds : " + diff);
		 }

	

}
