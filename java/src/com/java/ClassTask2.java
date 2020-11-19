package com.java;

public class ClassTask2 {
	String rectangle(int length,int breadth)
	{
		if(length==breadth)
		{
			return "Square";
		}
		else
		{
			return "Not Square";
		}
	}

	public static void main(String[] args) {
		ClassTask2 a=new ClassTask2();
		String result =a.rectangle(10, 10);
	System.out.println(result);
	}

}
