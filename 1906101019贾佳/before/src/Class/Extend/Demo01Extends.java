package Class.Extend;

public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher = new Teacher();
        //Teacher类当中虽然什么也没写，但是会继承来自父类的method（）方法
        teacher.method();

        //创建另外一个对象
        Assistance assis = new Assistance();
        assis.method();
    }


}




