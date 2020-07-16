package Class;

public class Demo10StudentGouZao {
    public static void main(String[] args) {
        StudentGouzao stu1 = new StudentGouzao();//无参构造
        StudentGouzao std2 = new StudentGouzao("Mike",19);//全参构造
        System.out.println("name:"+std2.getName()+"age:"+std2.getAge());
        //如果需要改变对象当中的成员变量数据内容，任然需要serXxx方法
        std2.setAge(20);//改变年龄
        System.out.println("改变年龄："+std2.getAge());
    }
}
