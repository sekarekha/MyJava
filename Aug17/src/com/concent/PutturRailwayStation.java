package com.concent;

public class PutturRailwayStation {
    public static void main(String args[]) {

        int platFormNo = 1;
        String trainName = "Sapthagiri";
        if (trainName.equalsIgnoreCase("Sapthagiri")) {
            for (; platFormNo <= 5; platFormNo++) {
                if (platFormNo == 1) {
                    System.out.println("'Tiruttani Train' will be arrive in 10 minutes");
                    break;
                } else if (platFormNo == 2) {
                    System.out.println("Local Train should be arrive");
                    break;
                } else if (platFormNo == 3) {
                    System.out.println("'Sapthagiri' train will be arrive in 20 minutes");
                    break;
                }
            }
        } else if (trainName.equalsIgnoreCase("Garudadhri express")) {
            for (; platFormNo <= 10; platFormNo++) {
                if (platFormNo == 6) {
                    System.out.println("Tirupathi express will be arrive");
                    break;
                } else if (platFormNo == 8) {
                    System.out.println("Goods train will be come");
                    break;
                } else if (platFormNo == 10) {
                    System.out.println("Garudadhri express will be arrive in platform num 10");
                    break;
                }
            }
        } else {
            System.out.println("Today no trains running");
        }
    }
}
