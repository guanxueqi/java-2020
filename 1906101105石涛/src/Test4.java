import java.util.Arrays;

/*
练习：定义一个函数求出数组中的最大值。返回的结果为int类型。
无穷小的定义方法：float f=Float.NEGATIVE_INFINITY;
 */
public class Test4 {
    public static void main(String[] args){
        int m[]={1,2,3,4,100,72};
        System.out.println(max(m));
    }
    public static int max(int[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }
}
