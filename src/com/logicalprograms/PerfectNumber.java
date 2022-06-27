package com.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = in.nextInt();
		for(int i=1; i<n; i++)
		{
			if(n%i == 0)
			{
				sum=sum+i;
				
			}
		}
		
		if((sum==n)) 
		{
		System.out.println(n + " is a Perfect Number");
		}	
			else	
			{ 
				System.out.println(sum + " is not aPerfect Number");
			}	
	}
}
