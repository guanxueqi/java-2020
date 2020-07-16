package Class;

public class Demo01Phone1 {
    public static void main(String[] args) {
        Phone one = new Phone();

        one.brand="华为";
        one.color="black";
        one.price=4300.00;
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.call("马克思佩恩");
        one.sendMessege();
    }
}
