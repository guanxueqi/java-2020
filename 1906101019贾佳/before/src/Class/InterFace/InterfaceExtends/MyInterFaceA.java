package Class.InterFace.InterfaceExtends;

public interface MyInterFaceA {
    public abstract void methodA();

    public abstract void methodCommen();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
