package com.concent;

public class InsideApartment {
    public static void main(String args[]) {
        int apartmentNum = 826;
        int buildingNum = 75;
        String checkAppliances = "Stove";
        String checkAmenities = "Swimming pool";
        // I want to check inside home appliances
        if (buildingNum == 75) {
            if (apartmentNum == 826) {
                if (checkAppliances.equals("Stove")) {
                    System.out.println("Stove Available: " );
                }  if (checkAppliances.equals("Dishwasher")) {
                    System.out.println(" DishwasherAvailable: " );
                } if (checkAppliances.equals("Refrigirator")) {
                    System.out.println("Refrigirator Available: " );
                }
            }

        }  else if (buildingNum == 25) {
            if (apartmentNum == 326) {
                if (checkAppliances.equals("Stove")) {
                    System.out.println("Available: " + checkAppliances);
                }  if (checkAppliances.equals("Dishwaher")) {
                    System.out.println("Not available: " + checkAppliances);
                }  if (checkAppliances.equals("Refrigirator")) {
                    System.out.println("Available: " + checkAppliances);
                }
            }
        }  else if (buildingNum == 55) {
            if (checkAmenities.equals("Swimming pool")) {
                System.out.println("It is available in basement=>2");
            }  if (checkAmenities.equals("tennis court")) {
                System.out.println("It is available");
            }  if (checkAmenities.equals("gym")) {
                System.out.println("Available in basement=>2");
            }
        }

    }
}
