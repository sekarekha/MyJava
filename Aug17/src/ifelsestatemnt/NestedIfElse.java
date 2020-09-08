package ifelsestatemnt;

public class NestedIfElse {
    public static void main(String args[]) {
        //declaring double type variables
        double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
        //checks n1 is greater than or equal to n2
        if (n1 >= n2) {
            //checks n1 is greater than or equal to n3
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }
        System.out.println("The largest nmber is " + largestNumber);
    }
}
