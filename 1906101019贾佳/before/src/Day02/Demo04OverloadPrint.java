package Day02;

public class Demo04OverloadPrint {
    public static void main(String[] args) {
        myPrint(100);
        myPrint("hello");
        myPrint('z');
        myPrint(true);
    }
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }
    public static void myPrint(char num){
        System.out.println(num);
    }
    public static void myPrint(int num){
        System.out.println(num);
    }
    public static void myPrint(long num){
        System.out.println(num);
    }
    public static void myPrint(float num){
        System.out.println(num);
    }
    public static void myPrint(double num){
        System.out.println(num);
    }
    public static void myPrint(boolean num){
        System.out.println(num);
    }
    public static void myPrint(String num){
        System.out.println(num);
    }

}
