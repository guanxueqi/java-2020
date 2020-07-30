package 之前的;

public class Test5 {
    // 构造方法，不能返回值，构造方法名必须和类名一样
    public Test5(String name){
        System.out.println("实例化一个学生");
        // 为了防止参数名与成员名重名
        this.name=name;
    }

    // 成员属性
    String name;
    int age;
    private String id="1906101105"; // 私有化

    // 一个成员属性，不希望被修改，但又希望被看到
    public void getid(){
        System.out.println(id);
    }

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
