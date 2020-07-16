package Day02;

public class Demo01MethodSame {
    /*
    题目要求:
    定义一个方法，用来判断两个数字是否相同。

     */
    public static void main(String[] args){
        System.out.println(isSame(20,10));
    }
    public static boolean isSame(int a , int b){
        //第一种方法，用if结构
//        boolean same;
//        if(a == b){
//            same = true;
//        }else{
//            same = false;
//        }
        //第二种 三元运算符
//        boolean  same = a==b ? true : false;
        //第三种 直接赋值
//        boolean same = a == b;
        //第四种 直接返回值
        return a == b;

    }

}
