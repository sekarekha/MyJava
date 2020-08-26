package com.concent;

public class InsuranceAgeCriteria {
    public static void main(String args[]) {
        int age = 1;


        if (age <= 18) {
            System.out.println("Dependent: " + age);
        }
        if (age <= 40) {
            System.out.println("Primary person: " + age);
        }
        if (age <= 55) {
            System.out.println("Middle age: " + age);
        }
        if (age >= 65) {
            System.out.println("senior citizen: " + age);
        } else {
            System.out.println("not applicable: " + age);
        }


    }

}
