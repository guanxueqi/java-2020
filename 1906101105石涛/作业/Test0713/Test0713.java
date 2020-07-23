package Test0713;

import java.util.Scanner;

public class Test0713 {
    public static void main(String[] args) {
//        作业1
//        根据输入的分数打印其对应的等级，85-100为A，70-85为B，55-70为C，55以下为D。
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if (a>=85){
            System.out.println('A');
        }
        else if (a>=70){
            System.out.println('B');
        }
        else if (a>=55){
            System.out.println('C');
        }
        else System.out.println('D');

//        作业2
//        输入两个值x和y,使用三元运算符打印其中最大值
        int x=in.nextInt();
        int y=in.nextInt();
        System.out.println(x>y?x:y);

//        作业3
//        分别用for、while、do-while求1-100的和（包含1和100）
        /*
        for循环
         */
        int num1=0;
        for (int i=0;i<101;i++){
            num1+=i;
        }
        System.out.println(num1);

        /*
        while循环
         */
        int num2=0;
        int k=1;
        while (k<101){
            num2+=k;
            k++;
        }
        System.out.println(num2);

        /*
        do-while循环
         */
        int num3=0;
        int l=1;
        do{
            num3+=l;
            l++;
        }while (l<101);
        System.out.println(num3);

    }
}
