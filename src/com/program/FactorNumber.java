package com.program;

public class FactorNumber {
	public static void main(String[] args) {
		int n=6;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println("Factors of number are" + i);
			}
		}
	}

}
