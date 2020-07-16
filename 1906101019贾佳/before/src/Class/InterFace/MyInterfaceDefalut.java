package Class.InterFace;

public interface MyInterfaceDefalut {
    //抽象方法
    public abstract void methodAbs();


    //新添加一个方法
    //新添加的方法改为默认方法，就不用在实现类里面重写
    public default void methodDefault(){
        System.out.println("这是新添加的默认方法");
    }

}
