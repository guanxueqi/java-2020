package Basement;

public class Demo04Operator {
    public static void main(String[] args){
        //常量之间的运算
        System.out.println(20 + 30);

        //变量之间的数学运算
        int a = 20;
        int b = 30;
        System.out.println(a - b);

        //变量和常量之间可以混合使用
        System.out.println(a * 10);

        int x = 10;
        int y = 3;
        int result1 = x/y;
        System.out.println(result1); //3

        int result2 = x%y;
        System.out.println(result2);//求余数（模），1

        //int + double --> double + double --> double
        double result3 = x +2.5;
        System.out.println(result3);//12.5

    }
}
