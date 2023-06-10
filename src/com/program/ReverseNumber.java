package com.program;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		// assign given number and reverse 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		//int n=1234, rev=0;
		int rev=0;
		while(n !=0) {
			
			int rem=n%10;// assign remainder
			rev=rem+rev*10;
			n=n/10;
		}
		System.out.println("The reverse of given number is :" + rev);	
	}

}
