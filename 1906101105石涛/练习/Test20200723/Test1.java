package Test20200723;

public class Test1 {
    public static void main(String[] args){
        Student student=new Student();
        student.setName("开飞船的大哥哥");
        student.setAge(20);
        student.show();

        Mouse mouse=new Mouse("耗子",12138,"haozi",12139);
        Animal animal=new Animal("动物",12138);
        animal.eat();
        animal.sleep();
        animal.hello();
        mouse.eat();
        mouse.sleep();
        mouse.hello();
    }
}
