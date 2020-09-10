package LoopExamples;

public class Example2 {
    public static void main(String args[]) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        //using loop
       /* for (int i = 0; i < vowels.length; ++i) {
            System.out.println(vowels[i]);
        }*/

        //using foreach loop
        for (char item : vowels) {
            System.out.println(item);
        }
    }
}
