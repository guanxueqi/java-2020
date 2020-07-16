package Basement;

public class Demo07Operator {
    public static void main(String[] args){
        int a = 10;
        a += 5;
        System.out.println(a);

        int x = 10;
        x %= 3;
        System.out.println(x);

        byte num = 30;
        //num = num + 5
        //num = byte + int
        //num = int + int
        //num = int
        //num = (byte) int
        num += 5;
        System.out.println(num);//35
    }
}
