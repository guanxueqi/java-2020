package Test20200723;

public class Student {
    //成员变量
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //成员方法
    public void show(){
        System.out.println("姓名："+name+","+"年龄："+age);
    }

}
