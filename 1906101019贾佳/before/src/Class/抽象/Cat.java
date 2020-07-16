package Class.抽象;

public class Cat extends Animal{

    @Override
    public void eat(){//覆写父类的抽象方法
        System.out.println("猫吃鱼");
    }
}
