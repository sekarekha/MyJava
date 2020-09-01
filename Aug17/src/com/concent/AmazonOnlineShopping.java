package com.concent;

public class AmazonOnlineShopping {
    public static void main(String args[]) {
        String phones = "iphones";
        int modelNum;
        int price = 100000;
        int model = 7;
        if (phones.equalsIgnoreCase("iphones")) {
            for (modelNum = 1; modelNum <= 10; modelNum++) {
                if (model == 1) {
                    System.out.println("Apple iPhone 11 ");
                    System.out.println("Price:" + "$" + price + " " + "CDN$ 9.99 shipping");
                    System.out.println("Add item to cart");
                    break;
                } else if (model == 3) {
                    System.out.println("Apple iPhone Xs Max");
                    System.out.println("Price: " + "$" + price + " " + "FREE Shipping");
                    System.out.println("Add item to cart");
                    break;
                } else if (model == 6) {
                    System.out.println("Apple iPhone XR");
                    System.out.println("Price: " + "$" + price + " " + "FREE Shipping");
                    System.out.println("Add item to cart");
                    break;

                }
            }
        } else if (phones.equalsIgnoreCase("Samsung")) {
            for (modelNum = 11; modelNum <= 15; modelNum++) {
                if (model == 12) {
                    System.out.println("samsung galaxy S20");
                    System.out.println("Price:" + " " + price + "" + "CDN $10 shipping");
                    System.out.println("Add item to cart");
                    break;
                } else if (model == 14) {
                    System.out.println("Samsung Galaxy A51");
                    System.out.println("Price: " + "$" + price + " " + "FREE Shipping");
                    System.out.println("Add item to cart");
                    break;
                } else if (model == 15) {
                    System.out.println("Samsung Galaxy j20");
                    System.out.println("Price: " + "$" + price + " " + "FREE Shipping");
                    System.out.println("Add item to cart");
                    break;
                }
            }

        } else {
            System.out.println("search no result");
        }
    }
}



