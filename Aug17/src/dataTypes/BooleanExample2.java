package dataTypes;

public class BooleanExample2 {

    public static void main(String args[]) {
        byte minutes = 2;
        byte pressCount;
        String options = "ExpressCook";//popCorn
        boolean click = true;
        if (click) {
            System.out.println("oven is on");
            if (options.equals("ExpressCook")) {
                for (pressCount = 1; pressCount <= 9; pressCount++) {
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
                for (pressCount = 1; pressCount <= 3; pressCount++) {
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


