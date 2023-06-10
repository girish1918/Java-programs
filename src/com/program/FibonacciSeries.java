package com.program;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10, v1 = 0, v2 = 1; // decalre V1 as 1stterm & v2 as 2ndterm
		for (int i = 1; i <= n; i++) {
			System.out.print(v1 + ",");

			int temp = v1 + v2;
			v1 = v2;
			v2 = temp;

		}
	}
}
