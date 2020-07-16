package zuoye;

import java.util.Scanner;
public class di3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x1=0;
        int s1=0;
        while (x1<100){
            x1++;
            s1=s1+x1;
        }
        int x2=0;
        int s2=0;
        do{
            x2++;
            s2=s2+x2;
        }while(x2<100);
        int s3=0;
        for(int x3=0;x3<=100;x3++){
            s3=s3+x3;
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
