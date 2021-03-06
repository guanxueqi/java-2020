package Basement;
/*
七、	变量
变量：程序运行期间，内容可以发生改变的量。
创建一个变量并且使用的格式：
数据类型 变量名称;  //创建了一个变量
变量名称 = 数据值;  //赋值，将右边的数据值，赋值交给左边的变量
一步到位的格式：
数据类型 变量名称 = 数据值; //在创建一个变量的同时，立刻放入指定的数据值

 */
public class Demo02Variable {
    public static void main(String[] args){
        //创建一个变量
        //格式：数据类型 变量名称；
        int num1;
        //向变量当中存入一个数据值
        //格式：变量名称 = 数据值；
        num1 = 10;
        System.out.println(num1);
        //改变变量当中本来的数字，变成新的数字
        num1 = 20;
        System.out.println(num1);
        //使用一步到位的格式
        // 数据类型 变量名称 = 数据值;
        int num2 = 10;
        System.out.println(num2);

        byte num3 = 90; //注意：右侧数值的范围把你超过左侧数据类型的取值范围
        System.out.println(num3);

        short num5 = 50;
        System.out.println(num5);
        System.out.println(num5);

        long num6 = 3000000000L;
        System.out.println(num6);

        float num7 = 2.5F;
        System.out.println(num7);

        double num8 = 1.2;
        System.out.println(num8);

        char zifu1 = 'A';
        System.out.println(zifu1);

        zifu1 = '中';
        System.out.println(zifu1);

        boolean var1 = true;
        System.out.println(var1);

        var1 = false;
        System.out.println(var1);

        //将一个变量的数据内容，复制交给另一个变量
        boolean var2 = var1;
        System.out.println(var2);
    }
}
