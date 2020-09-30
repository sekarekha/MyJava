package october;

public class ForLoopVsForEachLoop {
    public static void main(String args[]) {
        /*char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            System.out.println(vowels[i]);
        }*/
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char item : vowels) {
            System.out.println(item);
        }
    }
}
