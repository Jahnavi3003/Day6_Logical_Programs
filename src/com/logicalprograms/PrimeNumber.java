package com.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args){
		int a=0, flag=0, num;
		Scanner n= new Scanner(System.in);
		System.out.println("Enter the number to check");
		num= n.nextInt();
		a=num/2;
		if(num==0 || num==1) {
			System.out.println(+ num + " is not a Prime Number");
		}
		else
		{
			for (int i=2 ; i<=a; i++)
			{
				if(num%2==0)
				{
					System.out.println(+ num + " is not a Prime Number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(+ num + " is  a Prime Number");
			}
		}
		
		
	}

}
