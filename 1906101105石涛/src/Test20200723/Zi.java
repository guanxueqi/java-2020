package Test20200723;

public class Zi extends Fu{
    String name="子类";

    public void show(String name){
//        name="局部变量";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("我是你儿子!");
    }
}
