package datatypes;

public class BooleanExample {
    public static void main(String args[]) {
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
        if (b) {
            System.out.println("This is executed.");
        }
        b = false;
        if (b) {
            System.out.println("This is not executed.");
        }
        System.out.println("5>2 is " + (5 > 2));
    }
}
