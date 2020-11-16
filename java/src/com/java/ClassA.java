package com.java;

public class ClassA {
	ClassA()
	{
		System.out.println("Addition "+"="+(2+5));
	}
	ClassA(int a,int b)
	{
		System.out.println("Subtraction"+"="+(a-b));
	}
	void meth1()
	{
		System.out.println("Multiplication"+"="+(10*5));
		new ClassA(10,5).meth2(10, 5);
	}
	void meth2(int a,int b)
	{
		System.out.println("Division"+"="+(a/b));
	}
	

	public static void main(String[] args) {
		new ClassA().meth1();

	}

}
