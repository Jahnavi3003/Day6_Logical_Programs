package com.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int rev=0,n1;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = n.nextInt();
		while(num!=0)
		{
			n1 =num%10;
		    rev= (rev*10)+n1;
		    num=num/10;
		}
		System.out.println("Reverse of " + num + " is " + rev);
	}

}
