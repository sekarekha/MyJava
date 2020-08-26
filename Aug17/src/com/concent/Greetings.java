package com.concent;

public class Greetings {
    public static void main(String args[]) {
        int time = 24;

        if (time <= 24) {
            for (time = 0; time <= 9; time++) {
            /*    if(time<=9){
                System.out.println("Good morning");
            } else if (time < 3) {
                System.out.println("Good Afternoon");
            } else if (time < 18) {
                System.out.println("Good night");
            } else {
                System.out.println("Good day");
            }*/
              /*  if (time < 9) {
                    System.out.println("Good morning");
                }
                if (time < 3) {
                    System.out.println("Good Afternoon");
                }
                if (time < 18) {
                    System.out.println("Good night");
                } else {
                    System.out.println("Good day");
                }*/
            if (time <= 9) {
                System.out.println("Good morning");
                break;
            } else if (time <= 12) {
                System.out.println("Good Afternoon");
                break;
            } else if (time <= 24) {
                System.out.println("Good night");
                break;
            } else {
                System.out.println("Good day");
                break;
            }
            }
        }
    }
}
