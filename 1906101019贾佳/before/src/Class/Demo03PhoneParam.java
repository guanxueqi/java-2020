package Class;

public class Demo03PhoneParam {
    public static void main(String[] args) {
        Phone one  = new Phone();
        one.brand = "苹果";
        one.color = "blue";
        one.price = 9900.00;
        method(one);//传递进去的参数是地址值
    }

    public static void method(Phone param) {
        System.out.println(param.price);
        System.out.println(param.brand);
        System.out.println(param.color);

    }
}
