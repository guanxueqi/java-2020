package Class.抽象;
//抽象方法:就是加上abstract关键字，然后去掉大括号，直接分号结束。
//抽象类:抽象方法所在的类，必须是抽象类才行。在class之 前写上abstract即可。.
public abstract class Animal {//抽象类
    public abstract  void eat();//抽象方法，吃什么不确定

    //普通方法
    public void sleep(){

    }
}
