package Array;

public class Demo11ArrayReturn {
    public static void main(String[] args) {
        int [] J= calculate(1,2,3);
        System.out.println("求和"+J[0]);
        System.out.println("平均数"+J[1]);
        System.out.println("地址值"+J);
    }

    public static int [] calculate(int a,int b, int c) {
        int sum = a+b+c;
        int avarage = (a+b+c)/3;
        int[] array = {sum,avarage};
        System.out.println("方法中的地址值"+array);
        return array;
    }
}
