package Class;

public class Demo11StudentStandarad {
    public static void main(String[] args) {
        StudentStandard std1 = new StudentStandard();
        std1.setAge(20);
        std1.setName("SAM");
        System.out.println("name:"+std1.getName()+",age:"+std1.getAge());

        StudentStandard std2 = new StudentStandard("Jerry",21);
        System.out.println("name:"+std2.getName()+",age:"+std2.getAge());
        std2.setAge(30);
        System.out.println("name:"+std2.getName()+",age:"+std2.getAge());

    }
}
