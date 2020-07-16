package Day02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        int num = sum(30, 10);
        num += 100;
        System.out.println("变量的值：" + num);
    }

    public static int sum(int a, int b) {
        int y = a + b;
        return y;
    }
}

