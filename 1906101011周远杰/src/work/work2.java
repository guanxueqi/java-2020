package src.work;
import java.util.Scanner;
//2.输入两个值x和y,使用三元运算符打印其中最大值
public class work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int max= x>=y ? x:y;
        System.out.println(max);
    }
}
