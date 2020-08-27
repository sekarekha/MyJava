package com.concent;

public class MiHomesModels {
    public static void main(String args[]) {
        String cost = "4 million";
        String houseModel = "Hanley";
        if (houseModel.equalsIgnoreCase("Fenmore")) {
            System.out.println(houseModel + ":" + "It has 3,300 sqft and 5 Bedrooms and 3 Full Bathrooms ");
            System.out.println(cost);
        } else if (houseModel.equalsIgnoreCase("Hanley")) {
            System.out.println(houseModel + ":" + "It has 3,100 sqft and 4 Bedrooms and 3 Full Bathrooms ");
            System.out.println(cost);
        } else if (houseModel.equalsIgnoreCase("prestan")) {
            System.out.println(houseModel + ":" + "It has 3,500 and 5 Bedrooms and 4 Full Bathrooms ");
            System.out.println(cost);
        } else {
            System.out.println("Go to another community");
        }
    }
}

