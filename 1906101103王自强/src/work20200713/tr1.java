package work20200713;

//2.输入两个值x和y,使用三元运算符打印其中最大值
import java.util.Scanner;
public class tr1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入x的值");
        int x=sc.nextInt();
        System.out.println("请输入y的值");
        int y=sc.nextInt();
        System.out.println(x<y?y:x);
    }
}
