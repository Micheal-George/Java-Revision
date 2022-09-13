package com.masai;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		  int Rlottery = (int)(Math.random() * 1000);

		  System.out.print("Enter a three-digit your lottery ticket number: ");
		  int LotteryTaken = input.nextInt();

		  int lD1 = Rlottery / 100;
		  int remainingDigits = Rlottery % 100;
		  int lD2 = remainingDigits / 10;
		  int lD3 = remainingDigits % 10;

		  int gD1 = LotteryTaken / 100;
		  int remainingDigit = LotteryTaken % 100;
		  int gD2 = remainingDigit / 10;
		  int gD3 = remainingDigit % 10;

		  System.out.println("The lottery number is " + Rlottery);

		  if (LotteryTaken == Rlottery)
		   System.out.println("Exact match: you win $10,000");
		      
		    else if (gD1 == lD1 && gD3 == lD2 && gD2 == lD3 ||
		        gD2 == lD1 && gD1 == lD2 && gD3 == lD3 ||
		        gD2 == lD1 && gD3 == lD2 && gD1 == lD3 ||
		        gD3 == lD1 && gD1 == lD2 && gD2 == lD3 ||
		        gD3 == lD1 && gD2 == lD2 && gD1 == lD3)
		      System.out.println("Match all digits: you win $3,000");
		       
		    else if (gD1 == lD1 || gD1 == lD2 || gD1 == lD3 ||
		        gD2 == lD1 || gD2 == lD2 || gD2 == lD3 ||
		        gD3 == lD1 || gD3 == lD2 || gD3 == lD3)
		      System.out.println("Match one digit: you win $1,000");
		    else
		      System.out.println("Sorry, no match");
	}

}
