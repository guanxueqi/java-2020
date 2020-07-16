package zuoye;

import java.util.Scanner;
public class di2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        int z=x>y?x:y;
        System.out.println(z);
    }
}
