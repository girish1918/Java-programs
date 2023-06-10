package com.program;

public class DuplicateArray {
	public static void main(String[] args) {
		int a[]= {1,5,8,5,9,1,4,6,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
