package practice;

public class Reverse {
    public static void main(String args[]){
        for(int i=4;i>0;i--){
            for(int j=0;j<4;j++){
                if(j%2==1){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
