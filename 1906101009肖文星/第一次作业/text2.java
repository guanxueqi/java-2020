package 第一次作业;
import java.util.Scanner;
public class text2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int max= x>=y ?x:y;
        System.out.println(max);

    }
}
