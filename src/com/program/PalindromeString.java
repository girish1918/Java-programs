package com.program;

public class PalindromeString {
	public static void main(String[] args) {
		String s="Girish";
		String rev="";
		for(int i=s.length()-1;i<=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(s.equals(rev)) {
			System.out.println("palindrom string");
		}
		else {
			System.out.println("not palindrom String");
		}
	}

}
