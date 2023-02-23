package com.bridgelab;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	double sum=0.0;
	for(int i=1;i<=num;i++) {
		 sum+=1.0/i;
		 
	}
	System.out.println("harmonic series value is "+sum);
	}

}
