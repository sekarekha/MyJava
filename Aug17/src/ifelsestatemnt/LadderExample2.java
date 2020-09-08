package ifelsestatemnt;

public class LadderExample2 {
    public static void main(String args[]) {
        int month = 4;
        String season = "";
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter Season");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring Season");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer Season");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Season is Bogus month");
        }

    }
}
