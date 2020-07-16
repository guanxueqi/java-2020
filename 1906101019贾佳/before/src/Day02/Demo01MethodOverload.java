package Day02;

public class Demo01MethodOverload {
    public static void main(String[] args){
        System.out.println(sum(20,10));
        System.out.println(sum(20,10,30));
        System.out.println(sum(20,10,30,20));
    }
    //   参数多类型顺序不同
    public static int sum (int a,double b){
        return (int)(a+b) ;
    }
    public static int sum (double a,int b){
        return (int)(a+b) ;
    }


    //参数类型不同
    public static int sum (double a,double b){
        return (int)(a+b) ;
    }

    //错误写法，与参数的名称无关
//    public static int sum (int x,int y){
//        return x+y ;}
    public static int sum (int a,int b){
        return a+b ;}

//错误写法，与方法的返回值类型无关
//    public static double sum(int a, int b){
//        return a + b +0.0;
//        }
















    public static int sum(int a,int b, int c){
        return a + b +c ;
    }
    public static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
