package Class;



public class Demo04PhoneReturn {
    public static void main(String[] args) {
        Phone two =  getPhone();
        System.out.println(two.color);
        System.out.println(two.brand);
        System.out.println(two.price);
        two.sendMessege();
        two.call("Mike");

    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "iPhone";
        one.price = 9000.00;
        one.color = "blue";
        return one;
    }
}
