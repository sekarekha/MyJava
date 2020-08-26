package com.concent;

public class TownCenterMall {
    public static void main(String args[]) {
        int floorNum =0;
        //String[] shopName =new String[] {"Childrens Place", "Toys r us", "Zara", "Gap", "Food Center"};
        String shopName ="Zara";
        //String selectedShop[]=3;


            if (shopName.equals("Zara")) {
                for (floorNum = 1; floorNum <= 5; floorNum++) {
                    if (floorNum == 4) {
                        System.out.println("It is located in upper floor= " + floorNum);
                    }

                }

            } else if (shopName.equals("gap")) {
                for (floorNum = 1; floorNum <= 5; floorNum++) {
                    if (floorNum == 2) {
                        System.out.println("It is located ground floor= " + floorNum);
                        break;
                    } else {
                        System.out.println("floors: " + floorNum);
                    }
                }
            } else if (shopName.equals("Toys r us")) {
                for (floorNum = 1; floorNum <= 5; floorNum++) {
                    if (floorNum == 4) {
                        System.out.println("It is located middle floor= " + floorNum);
                    }
                }
            } else {
                System.out.println("ShopName: " + floorNum);
            }
        }
    }
