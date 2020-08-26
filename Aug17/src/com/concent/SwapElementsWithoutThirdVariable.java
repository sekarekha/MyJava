package com.concent;

//shows how to swap value of two numbers without using third variable

public class SwapElementsWithoutThirdVariable {

    public static void main(String args[]) {
        int num1 = 5;
        int num2 = 10;
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is :" + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Value of num1 is :" + num1);
        System.out.println("Value of num2 is:" + num2);

    }


}
