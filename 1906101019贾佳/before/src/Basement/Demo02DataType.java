package Basement;
/*
	强制数据类型转换
1、	特点：代码需要进行特殊格式处理，不能自动完成
2、	格式：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据；
	注意事项：
1、	强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出
2、	byte/short/char这三种类型都可以发生数学运算，例如加法“+”
3、	byte/short/char这三种类型都可以发生数学运算，在运算的时候都会被首先提升为int类型，然后再计算

 */
public class Demo02DataType {
    public static void main(String[] args){
        int num = (int)100L;
        System.out.println(num);

        //long强制转换为int类型
        int num2 = (int)6000000000L;
        System.out.println(num2);//1705032704，数据溢出

        //double -->int,强制类型转换
        int num3 = (int)3.9;
        System.out.println(num3);//3,这并不是四舍五入，所有小数位都会被舍弃掉(精度损失)

        char zifu1 = 'A';
        System.out.println(zifu1 + 1);//66，也就是大写字母A被当作65进行处理

        byte num4 = 40;
        byte num5 = 50;
        //byte + byte --> int + int -->int
        int result1 = num5 + num4;//byte result1 = (byte)(num5 + num4);也可以，但是最后的答案是byte类型
        System.out.println(result1);

        short num6 = 60;
        //byte + short --> int + int --> int
        //int强制转换为short：注意必须保证逻辑上真是大小本来就没有超过short范围，否则会发生数据溢出
        short result2 = (short)(num4 + num6) ;//int result2 = num4 + num6也可以
        System.out.println(result2);

    }
}
