package Class.InterFace;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{

    @Override
    public void MethodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void MethodAbs() {
        System.out.println("覆盖重写的AB接口都有的抽象方法");
    }

    @Override
    public void MethodDefault() {

    }

    @Override
    public void MethodB() {
        System.out.println("覆盖重写了B方法");
    }
}
