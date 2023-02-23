package com.bridgelab;

import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter third number");
		int num3=sc.nextInt();
		int largest=num1;
		if(num2>largest) {
			largest=num2;
		if(num3>largest) {
			largest=num3;
			
		}
		System.out.println("largest number is :: "+largest);
		}
		
	}

}
