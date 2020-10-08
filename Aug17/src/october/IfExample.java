package october;

public class IfExample {
    public static void main(String args[]) {
        int age=15;
        if (age < 18) {
            System.out.println("Your Minor");
            System.out.println("Your not eligible to work");
        } else {
            if (age >= 18 && age <= 60) {
                System.out.println("Your eligible to work");
                System.out.println("Please your details and apply");
            } else {
                System.out.println("your too old to work as per the government rules");
                System.out.println("Please collect your pension");
            }
        }
    }
}
