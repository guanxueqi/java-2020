package Class;

public class Demo05VariableDifference {
    String name;//成员变量

    public void methodA(){
        int  num = 20;//局部变量
        System.out.println(num);
        System.out.println(name);
    }
    public void methodB(int a){//方法的参数属于局部变量
//        int age;
        System.out.println(a);
        System.out.println(name);
    }
}
