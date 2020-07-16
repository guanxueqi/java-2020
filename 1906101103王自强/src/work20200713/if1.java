package work20200713;
//1.根据输入的分数打印其对应的等级，85-100为A，70-85为B，55-70为C，55以下为D。
import java.util.Scanner;
public class if1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入分数");
        int grade=sc.nextInt();
        if (grade<=100 && grade>85){
            System.out.println('A');
        }else if(grade<=85 && grade>70){
            System.out.println('B');
        }else if(grade<=70 && grade>55){
            System.out.println('C');
        }else if(grade<=55) {
            System.out.println('D');
        }
    }
}
