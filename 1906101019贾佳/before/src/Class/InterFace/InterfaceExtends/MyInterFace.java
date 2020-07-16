package Class.InterFace.InterfaceExtends;
//这个子接口中有四个方法
//methodA来源于接口A
//methodB来源于接口B
//Method来源于自己
//methodCommon来源于A和B接口
public interface MyInterFace extends MyInterFaceA,MyInterFaceB{
    public abstract void Method();


    @Override
    default void methodDefault() {

    }
}
