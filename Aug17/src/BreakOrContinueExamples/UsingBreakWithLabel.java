package BreakOrContinueExamples;

public class UsingBreakWithLabel {
    public static void main(String args[]) {
        //first label
        first:
        for (int i = 0; i < 3; i++) {
            //second label
            second:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    //using break statement with label
                    break first;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
