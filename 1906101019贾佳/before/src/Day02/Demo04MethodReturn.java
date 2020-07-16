package Day02;

public class Demo04MethodReturn {
    public static void main(String[] args){
        //有返回值
        int sum = getSum(10,20);
        System.out.println(sum);
        //没有返回值
        printSum(20,30);
    }
    public static int getSum(int a , int b){
        int result = a +b;
        return result;
    }
    public static void printSum(int a , int b){
        int sum = a*b;
        System.out.println(sum);
    }
}
