package Class.InterFace.InterfaceExtends;

public interface MyInterFaceB {
    public abstract void methodB();

    public abstract void methodCommen();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
