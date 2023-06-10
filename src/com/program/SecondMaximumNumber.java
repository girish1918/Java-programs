package com.program;

import java.util.Arrays;

public class SecondMaximumNumber {
	static void getSecondMaxNumber(int arr[]) {
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 2]);
	}
    public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,10,8};
		getSecondMaxNumber(arr);
    }	
}
