package com.concent;

public class SensingAirConditioner {
    public static void main(String args[]) {
        String sensor = "on";
        boolean motionIdentified =true;
        if (sensor.equalsIgnoreCase("on")) {
            System.out.println("sensor on");
            if (motionIdentified == true) {
                System.out.println("person find near 30 feet");
            }
        } else
            System.out.println("sensor off");
    }
}
