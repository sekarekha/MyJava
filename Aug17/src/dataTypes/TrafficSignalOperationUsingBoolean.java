package dataTypes;

public class TrafficSignalOperationUsingBoolean {
    public static void main(String args[]) {
        int second = 0;
        String[] color = {"Red", "Green", "Orange"};
        boolean clickStop = false;
        boolean clickWait = true;
        boolean clickGo = false;
        if (clickStop == false) {
            for (second = 0; second < 60; second++) {
                System.out.println(" Color is :" + color[0]);
                System.out.println(" All vehicles will be stop. ");

            }
        } else {
            System.out.println("All vehicles will go ");
        }
        if (clickGo == false) {
            for (second = 0; second < 60; second++) {
                System.out.println(" Color is :" + color[1]);
                System.out.println("All vehicles will move");
                break;
            }
        } else {
            System.out.println("No vehicles");
        }
        if (clickWait == true) {
            System.out.println(" Color is :" + color[2]);
            System.out.println("All vehicles be ready to stop");
        } else {
            System.out.println("All vehicles go");
        }
    }
}
