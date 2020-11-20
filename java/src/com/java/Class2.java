package com.java;

public class Class2 {
	void display(int a,int b,String word)
	{
		switch(word)
		{
		case "add":
			System.out.println("addition : "+(a+b));
			break;
		case "sub":
			System.out.println("Subtraction : "+(a-b));
			break;
		case "mul":
			System.out.println("Multiplication : "+(a*b));
			break;
		case "div":
			System.out.println("Division : "+(a/b));
			break;
			default:
				System.out.println("No operations performed");
				break;
		}
	}

	public static void main(String[] args) {
		
          new Class2().display(10, 5, "add");
	}

}
