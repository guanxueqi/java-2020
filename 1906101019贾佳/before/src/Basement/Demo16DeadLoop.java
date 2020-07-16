package Basement;

public class Demo16DeadLoop {
    public static void main(String[] args){
        for(int i = 1;i<=10;){
            System.out.println("Hello"+1);
        }
        while(true){
            System.out.println("hello");
        }
    }
}
