package Basement;
/*
	注意事项：
1、	如果创建多个变量，那么变量之间的名称不可以重复
2、	对于float和long类型来说，字母后缀F和L不要丢掉
3、	如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围
4、	没有进行赋值的变量，不能直接使用；一定要赋值以后，才能使用
5、	变量使用不能超过作用域的范围
    【作用域】：从定义变量的第一行开始，一直到直接所属的大括号结束为止
6、	可以通过一个语句来创建多个变量，但是一般不推荐这么写

 */
public class Demo03VariableNotice {
    public static void main(String[] args){
        //System.out.println(num1);//在创建变量之前不能使用这个变量
        int num1 = 500;
        System.out.println(num1);

        {
            int num2 = 60;
            System.out.println(num2);
        }
        int num2 = 70;
        //System.out.println(num2);//已经超出了大括号的范围，超出了作用域，变量不能再使用了

        //同时创建三个全是int类型的变量
        int a,b,c;
        a=10;
        b=20;
        c=30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //同时创建三个int变量，并且同时各自赋值
        int x = 100,y = 200,z = 300;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
