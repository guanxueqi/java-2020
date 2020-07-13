package onetext;
import  java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int k = x > y ? x : y;
        System.out.println( k );

    }
}
