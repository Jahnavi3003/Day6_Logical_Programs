package com.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0,b=1,c=0;
		Scanner n=new Scanner(System.in);
		System.out.println("How many terms you want in fibonacci series: ");
		int num = n.nextInt();
		for(int i=0; i<num; i++) {
			if(i<=1)
			{
				c=i;
			}
			else
			{
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}
		
	}
}
