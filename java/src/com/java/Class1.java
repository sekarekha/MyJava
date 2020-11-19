package com.java;

public class Class1 {
	String person(int age)
	{
		
		if(age>=18)
		{
			return "Eligible";
		}
		else
		{
			return "Not eligible";
		}
	}
	public static void main(String[] args) {
		Class1 d=new Class1();
		String result=d.person(20);
		System.out.println(result);
		
	}

}
