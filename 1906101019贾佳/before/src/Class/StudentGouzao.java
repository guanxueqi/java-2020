package Class;

public class StudentGouzao {
    //成员变量
    private String name;
    private int age;
    //无参数构造方法
    public StudentGouzao(){
        System.out.println("无参数构造方法");

    }
    //有参数的构造方法
    public StudentGouzao(String name,int age){
        this.age=age;
        this.name=name;
        System.out.println("全参数构造方法执行");
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
