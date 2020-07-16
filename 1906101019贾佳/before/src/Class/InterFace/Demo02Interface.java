package Class.InterFace;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefalutA A = new MyInterfaceDefalutA();
        A.methodAbs();

        A.methodDefault();//直接调用默认方法

        MyInterfaceDefalutB B = new MyInterfaceDefalutB();
        B.methodAbs();
        B.methodDefault();//覆写后的默认方法

    }



}
