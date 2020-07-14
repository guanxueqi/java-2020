package 第一次作业;
import java.util.Scanner;
public class text1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score>=85&&score<=100){
            System.out.println("A");
        }
        else if(score>=70&&score<85){
            System.out.println("B");
        }
        else if(score>=55&&score<70){
            System.out.println("C");
        }
        else if(score<55){
            System.out.println("D");
        }
    }
}
