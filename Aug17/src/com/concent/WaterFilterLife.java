package com.concent;

public class WaterFilterLife {
    public static void main(String args[]) {
        //String waterFilterColor = "White";
        String indication = "orange";//orange//green
        String status = "Replace";//LongLast,StandardFilter
        if (indication.equalsIgnoreCase("Red")) {
            System.out.println("Replace the filter");
        } else if (indication.equalsIgnoreCase("Green")) {
            System.out.println("No need to replace");
        } else if (indication.equalsIgnoreCase("orange")) {
            System.out.println("Ready to replace");
        } else {
            System.out.println("water filter is white color");
        }

    }
}

