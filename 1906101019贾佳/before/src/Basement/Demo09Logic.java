package Basement;

import java.util.stream.StreamSupport;

public class Demo09Logic {
    public static void main(String[] args){
        System.out.println(true&&false);
        System.out.println(3<4&&10>5);
        System.out.println("=====================");

        System.out.println(true||false);
        System.out.println(true||true);
        System.out.println(false||false);

        System.out.println(true);
        System.out.println(!true);
        System.out.println("=====================");

        int a = 10;
        //false&&...
        System.out.println(3>4&& ++a < 100);//false,因为左边已经为false了，所以就不会运行右边了，所以++a没有运行
        System.out.println(a);//10
        System.out.println("=====================");

        int b = 20;
        //true||...
        System.out.println(3<4 || ++b < 100);
        System.out.println(b);//20
    }
}
