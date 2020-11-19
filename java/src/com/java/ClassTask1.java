package com.java;

public class ClassTask1 {
	ClassTask1(int a,int b)
	{
		if(a>b)
		{
			System.out.println("Greatest Number");
		}
		else if(a<b)
		{
			System.out.println("Least Number");
		}
		else
		{
			System.out.println("No Number");
		}
	}

	public static void main(String[] args) {
		new ClassTask1(23,19);
		

	}

}
