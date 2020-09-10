package LoopExamples;

public class ForEachLoop {
    public static void main(String args[]) {
        //create array
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;
        //for each loop   for(dataType item:array)
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("sum= " + sum);
    }
}
