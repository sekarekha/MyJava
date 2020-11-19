package com.java;

public class ClassTask3 {
       
	String purchase(int quantity)
	    {
		 
		if((quantity*100)>1000)
		{
			return "Totalcost is"+" = " +((quantity*100)-(quantity*100*0.1));
		}
		else
		{
			return "Totalcost is"+(quantity*100);
		}
		     
	    }
	
	public static void main(String[] args) {
		
         ClassTask3 obj=new ClassTask3();
         String result=obj.purchase(200);
         System.out.println(result);
         
	}

}
