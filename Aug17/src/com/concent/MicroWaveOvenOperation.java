package com.concent;

public class MicroWaveOvenOperation {

    public static void main(String args[]) {
        int minutes = 2;
        int press;
        String options = "ExpressCook";//popCorn
        String click = "start";
        if (click.equals("start")) {
            System.out.println("oven is on");
            if (options.equals("ExpressCook")) {
                for (press = 1; press <= 9; press++) {
                    if (minutes == 2) {
                        System.out.println("Food will be cook in " + minutes + " minutes");
                        break;
                    } else if (minutes == 5) {
                        System.out.println("Food will overcooked in " + minutes + " minutes");
                        break;
                    } else if (minutes == 9) {
                        System.out.println("Food will burn in " + minutes + "minutes");
                        break;
                    } else {
                        System.out.println("This option is not available");
                        break;
                    }
                }
            } else if (options.equals("popcorn")) {
                for (press = 1; press <= 3; press++) {
                    if (minutes == 1) {
                        System.out.println("Half corns only popped");
                        break;
                    } else if (minutes == 2) {
                        System.out.println("All corns will be popped");
                        break;
                    } else if (minutes == 3) {
                        System.out.println("Corns will burnt");
                        break;
                    }
                }
            }
        } else {
            System.out.println("oven will be stop");
        }

    }
}
