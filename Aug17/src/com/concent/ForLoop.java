package com.concent;

public class ForLoop {
    //public static void main(String args[]) {
        /*int x;
        for (x = 1; x <= 10; x = x + 1) {
            System.out.println("The x num is:" + x);
        }
    }
}*/
    public static void main(String args[]) {
            String array[] = {"RadhaKrishna", "Rekha", "Kaveesh", "Saatvik"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //same function to improve I used for-each loop   for(type varaiable name:array name)
        for(String x:array){
            System.out.println(x);
              }
       /* int sum = 0;
        for (int z = 1; z < 10; z++) {
            sum = sum + z;
            System.out.println("in sum is:" + sum);
        }
        System.out.println("The sum is:" + sum);
    }*/
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }
    }
}