package october;

public class Output {
    public static void main(String args[]) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

