package com.concent;

public class BridleWoodCommunity {
    public static void main(String args[]) {
        int buildingNum = 25;
        int floorNum;
        char team ='a';
        //System.out.println("8th floor arrived:  "+floorNum);
        if (buildingNum == 75) {
            for (floorNum = 1; floorNum < 22; floorNum++) {
                if (floorNum == 8) {
                    System.out.println("8th floor arrived:  " + floorNum);
                }
            }
        } else if (buildingNum == 25) {
            for (floorNum = 22; floorNum >= 1; floorNum--) {
                if (floorNum == 3) {
                    System.out.println("3rd floor arrived:  " + floorNum);
                    break;
                } else {
                    System.out.println("Floors :" + floorNum);
                }
            }
        } else if (buildingNum == 55) {
            for (floorNum = 1; floorNum <= 22; floorNum++) {
                if (floorNum == 22) {
                    System.out.println("22nd floor arrived:  " + floorNum);
                }
            }
        } else {
            System.out.println("Building number :" + buildingNum);
        }

    }

}
