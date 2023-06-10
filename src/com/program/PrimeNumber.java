package com.program;

public class PrimeNumber {
public static void main(String[] args) {
	int n=11, i, count=0;
	for(i=2 ; i<n; i++) {
		if(n%i ==0) {
			count++;
			
		}
	}
	 
    if(count==0)
       System.out.println("\nIt is a Prime Number.");
    else
       System.out.println("\nIt is not a Prime Number.");
}
}
