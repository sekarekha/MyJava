package IterationStatements;

public class WhileLoopNoBody {
    public static void main(String args[]) {
        int i, j;
        i = 100;
        j = 200;
        //find mid point between i and j
        while (++i < --j);//no body in this loop
            System.out.println("Mid ponit is " + i);
    }
}
