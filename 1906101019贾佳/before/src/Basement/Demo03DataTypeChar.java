package Basement;

public class Demo03DataTypeChar {
    public  static void main(String[] args){
        char zifu1 = '1';
        System.out.println(zifu1 + 0);//49,加法运算，转换为int类型进行运算

        char zifu2 = 'A';

        char zifu3 = 'c';
        //左侧是int类型，右边是char类型
        //char --> int。确实是从小到大
        //发生了自动类型转换
        int num = zifu3;
        System.out.println(num);//99
        char zifu4 = '中';
        System.out.println(zifu4 + 0);

    }
}
