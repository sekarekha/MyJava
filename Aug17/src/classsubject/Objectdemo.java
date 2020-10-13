package classsubject;

class calc {
    int num1;
    int num2;
    int result;

    public void perform() {
        result = num1 + num2;
    }
}

public class Objectdemo {
    public static void main(String args[]) {
        calc obj = new calc();
        obj.num1 = 2;
        obj.num2 = 3;
        obj.perform();
        System.out.println(obj.result);
    }
}
