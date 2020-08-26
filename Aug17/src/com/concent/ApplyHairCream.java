package com.concent;

public class ApplyHairCream {
    public static void main(String args[]) {
        int hairCream;

        //step1:Apply cream
        //step2:Wash and Rinse;
        //step3:If cream is not finished,go back to step1
        for (hairCream = 1; hairCream <= 10; hairCream++) {
            if (hairCream <= 2) {
                System.out.println("Cream not yet finished ");
            } else {
                System.out.println("go back to step1 " +hairCream);
                break;
            }
        }
    }
}
