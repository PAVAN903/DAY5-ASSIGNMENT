package com.bridgelab;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("before swapping number 1 :: "+a);
		System.out.println("before swapping number 2 :: "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping number 1 :: "+a);
		System.out.println("after swapping number 2:: "+b);
	}

}
