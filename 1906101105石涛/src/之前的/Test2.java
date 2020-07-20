package 之前的;

// 方法重载
public class Test2 {
    public static void main(String[] args){
        System.out.println(sum(5,7));
        System.out.println(sum(5,7,8));
        System.out.println(sum("abc","cde"));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static String sum(String a,String b){
        return a+b;
    }
}
