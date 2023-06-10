package com.program;

public class ArmstrongNumber {
public static void main(String[] args) {
	int n=141;
	int temp=n;
	int armNum=0;
	int rem;
	 while(temp > 0) {
		 rem=temp%10;
		 armNum=armNum+(rem*rem*rem);
		 temp=temp/10;
	 }if(n==armNum) {
		 System.out.println(n +" is  Armstrong Number");
	 }else {
		 System.out.println(n +" is not  Armstrong Number");
	 }
}
}
