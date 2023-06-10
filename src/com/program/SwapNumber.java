package com.program;

public class SwapNumber {
 public static void main(String[] args) {
	int a=10;
	int b=20;
	
	//before swapping
	System.out.println("a="+ a );
	System.out.println("b="+ b );
	
	//after swapping
	a=a+b;
	b=a-b;
	a=a-b;
	
	
	System.out.println("a="+ a );
	System.out.println("b="+ b );
	
	
			
	
	
}
}
