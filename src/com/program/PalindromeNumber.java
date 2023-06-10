package com.program;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n=121, rev=0, rem;
		int temp=n;
		while(temp !=0) {
			rem=temp%10;
			rev=rem+rev*10;
			temp=temp/10;
		}
		if(n==rev) {
			System.out.println("palindrom number");
		}
		else {
			System.out.println("not palindrom number");
		}

	}

}
