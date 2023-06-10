package com.program;

public class MaximumNumber {
	public static void main(String[] args) {
		int a[]= {5, 4, 2, 6, 7, 9};
		 int max=a[0];
		 for(int i = 1;i<a.length;i++) {
			 if(a[i]>max) {
		       max=a[i]; 
			 }
		 }
		 System.out.println("Maximum Number is " + max);
	}

}
