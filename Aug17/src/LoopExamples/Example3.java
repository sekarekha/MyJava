package LoopExamples;

public class Example3 {
    public static void main(String args[]) {
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : numbers) {
            System.out.println("value is: " + x);
            sum += x;
            if (x == 5)
                break;
        }
        System.out.println("summation of first five elements: " + sum);
    }
}
