package com.program;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name");
		String name=sc.next();
		//String name="Girish",reverse="";
		String reverse="";
		int l=name.length();
		for(int i=l-1; i>=0; i--) {
			reverse=reverse+name.charAt(i);
		}
		System.out.println("The reverse of given string is:" +reverse);
	}
	 
		
		 
}
