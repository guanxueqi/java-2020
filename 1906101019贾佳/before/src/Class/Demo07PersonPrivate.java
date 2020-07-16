package Class;

public class Demo07PersonPrivate {
    public static void main(String[] args) {
        Person per = new Person();
        per.name = "Mike";
        per.setAge(-20);
        per.show();
    }
}
