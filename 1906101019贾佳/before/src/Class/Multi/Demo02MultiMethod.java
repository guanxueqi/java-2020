package Class.Multi;

public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu1 obj = new Zi1();

        obj.MethodA();//子父都有，优先用子

        obj.MethodFu();//子类没有，向上找
    }



}
