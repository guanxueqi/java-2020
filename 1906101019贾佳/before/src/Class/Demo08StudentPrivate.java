package Class;

public class Demo08StudentPrivate {
    public static void main(String[] args) {
        StudentPrivate stup = new StudentPrivate();

        stup.setName("John");
        stup.setAge(20);
        stup.setMale(false);

        System.out.println("name："+stup.getName());
        System.out.println("Man?"+stup.isMale());
        System.out.println("age:"+stup.getAge());

    }
}
