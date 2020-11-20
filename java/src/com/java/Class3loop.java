package com.java;

public class Class3loop {
	void display(int num)
	{
		for(int i=1;i<=10;i++)
		{
			int c=num*i;
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

	public static void main(String[] args) {
		new Class3loop().display(10);

	}

}
