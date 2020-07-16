package Basement;
/*
	自动类型转换（隐式）
1、	特点：代码不需要进行特殊处理，自动完成
2、	规则：数据范围从小到大（低  ------------------------------------>  高）
byte,short,char—> int —> long—> float —> double

 */
public class Demo01DataType {
    public static void main(String[] args){
        System.out.println(1024); //这就是一个整数，默认int类型
        System.out.println(3.14);//这是一个浮点数，默认Double类型

        //左边是long类型，右边是默认的int类型，左右不一样
        //一个等号代表赋值，将右侧的int常量，交给左侧的long变量进行存储
        //int -->long，符合了数据范围从小到大的要求
        //这一回代码发生了自动类型转换
        long num1 = 100;
        System.out.println(num1);

        //左边是double类型，右边是float类型，左右不一样
        // float --> double, 符合从小到大的规则
        //也发生了 自动类型转换

        double num2 = 2.5F;
        System.out.println(num2);

    }
}
