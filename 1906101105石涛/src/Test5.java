public class Test5 {
    // 构造方法，不能返回值，构造方法名必须和类名一样
    public Test5(String name){
        System.out.println("实例化一个学生");
    }

    // 成员属性
    String name;
    int age;

    // 成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
