package com.java;

public class ClassTask4 {
	String school(int marks)
	{
		if(marks<25)
		{
			return "F";
		}
		else if(marks>25 && marks<45)
		{
			return "E";
		}
		else if(marks>45 && marks<50)
		{
			return "D";
		}
		else if(marks>50 && marks<60)
		{
			return "C";
		}
		else if(marks>60 && marks<80)
		{
			return "B";
		}
		else if(marks>80) {
			return "A";
		}
		else
		{
			return "Absent";
		}
		
	}

	public static void main(String[] args) {
		ClassTask4 obj=new ClassTask4();
		String result=obj.school(38);
		System.out.println(result);
		

	}

}
