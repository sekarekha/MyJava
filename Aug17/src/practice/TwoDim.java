package practice;

public class TwoDim {
    public static void main(String args[]) {
        int[][] n = {{1 * 1, 1 * 0, 1 * 1, 1 * 0},
                {1 * 1, 1 * 0, 1 * 1, 1 * 0},
                {1 * 1, 1 * 0, 1 * 1, 1 * 0},
                {1 * 1, 1 * 0, 1 * 1, 1 * 0}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}
