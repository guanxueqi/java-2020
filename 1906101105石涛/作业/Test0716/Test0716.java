package Test0716;

import java.util.Arrays;

/*
练习：定义一个函数求出数组中的最大值。返回的结果为int类型。
无穷小的定义方法：float f=Float.NEGATIVE_INFINITY;
 */
public class Test0716 {
    public static void main(String[] args){
        int m[]={1,2,3,4,100,72};
        System.out.println("最大值是："+max(m));
        System.out.println("最大值是："+max_for(m));
    }

    // 用Arrays模板求最大值
    public static int max(int[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }

    // for循环求数组中的最大值
    public static int max_for(int[] num) {
        int a=num[0];
        for (int i = 0; i < num.length; i++) {
            if(num[i]>a){
                a=num[i];
            }
        }
        return a;
    }
}