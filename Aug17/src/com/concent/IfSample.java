package com.concent;

public class IfSample {
    public static void main(String args[]){
        int x,y;
        x=10;
        y=20;
        if(x<y){
            System.out.println("x is less than y");
        }
        x=x*2;
        if(x==y){
            System.out.println("x is equal to y");
        }
        x=x*2;
        if(x>y){
            System.out.println("x is greater than y");
        }
    }}
   /* public static void main(String args[]) {
        int x, y, z;
        x = 55;
        y = 65;
        z = 75;
        if (x < 65) {
            System.out.println("second class");
        } else if (y < 75) {
            System.out.println("First class");
        } else if (z < 100) {
            System.out.println("Distinction");
        }
    }
}*/
