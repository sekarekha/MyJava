package SwitchExamples;

public class NestedSwitch {
    public static void main(String args[]) {
        String foodShop = "McDonald";
        int floor = 3;
        switch (floor) {
            case 1:
                System.out.println("All kind of toys are available");
                break;
            case 2:
                System.out.println("Clothes shop");
                break;
            case 3:
                System.out.println("Food court");

                switch (foodShop) {
                    case "McDonald":
                    case "BurgerKing":
                        System.out.println("Burgers:Turkey Burgers,Veggie Burgers ");
                        break;
                    case "KFC":
                        System.out.println("Burgers:BlackBean Burger,WildSalmon Burger");
                        break;
                    default:
                        System.out.println("Burgers:optional");

                }
        }
    }
}
