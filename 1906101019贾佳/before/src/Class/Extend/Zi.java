package Class.Extend;

public class Zi extends Fu{

    public Zi(){
        super();
    }
    public void methodZi(){
        System.out.println(super.num);//继承父类变量
    }
    public void method(){
       // super.method();//继承父类方法
        System.out.println("子类方法");
    }
}
