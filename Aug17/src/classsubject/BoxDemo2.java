package classsubject;

class Boxes {
    double width;
    double height;
    double depth;

}

public class BoxDemo2 {
    public static void main(String args[]) {
        Boxes b1 = new Boxes();
        Boxes b2 = new Boxes();
        double volume;
        b1.width = 10;
        b1.height = 20;
        b1.depth = 15;
        b2.width = 3;
        b2.height = 6;
        b2.depth = 9;
        volume = b1.width * b1.height * b1.depth;
        System.out.println("Volume is:" + volume);
        volume = b2.width * b2.height * b2.depth;
        System.out.println("Volume is:" + volume);
    }
}
