package Basement;

public class Demo11Method {
    public static void main(String[] args){
        //调用seller方法
        seller();
        //调用me方法
        me();
        //调用farmer对象
        farmer();
    }
    public static void farmer(){
        System.out.println("farmer");
    }
    public static void seller(){
        System.out.println("seller");
    }
    public static void me(){
        System.out.println("me");
    }

}
