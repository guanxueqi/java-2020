package Class.抽象.Animal1;

public class DemoMain {
    public static void main(String[] args) {
        //Dog D = new Dog() ;//抽象类不能直接引用

        Dog2H H = new Dog2H();//普通类可以引用

        DogGolden G = new DogGolden();
        H.eat();
        H.sleep();

        G.sleep();
        G.eat();
    }
}
