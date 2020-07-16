package Class;

public class Demo02Student {
    public static void main(String[] args) {
       // 1.导包.（位于同一个包，不需要导包）


       //2.创建.格式：
       //类名称 对象名 = new 类名称();
       Student stu = new Student();

       //3.使用其中的成员变量，格式：
        //对象名.成员变量名
        System.out.println(stu.name);
        System.out.println(stu.age);

        //改变对象当中的成员变量
        //将右侧的字符串，赋值交给stu对象当中的name成员变量
        stu.name = "John";
        stu.age = 18;
        System.out.println(stu.name);
        System.out.println(stu.age);

        //4.使用对象的成员方法，格式:
        //对象名.成员方法（）
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
