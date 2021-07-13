package com.carrearit.cj.conditionalstmt;

import java.util.Scanner;

public class ConNegtoPosit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num1=sc.nextInt();
		if(num1<0) {
			num1=Math.abs(num1);
			//System.out.println("Positive number = "+num2);
			
		}
		System.out.println("Positive number = "+num1);
		sc.close();
	}

}
