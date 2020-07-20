package Test20200720;

public class Test06 {
    //构造函数--> __init__


    public static void main(String[] args){
        Student student=new Student("长毛程序员");
        method(student);
    }
    public static void method(Student stu){
        System.out.println(stu.name);
    }



}
