package zuoye;

import java.util.Scanner;
public class di1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        if(x>=85){
            System.out.println("A");
        }else if(x>=70){
            System.out.println("B");
        }else{
            System.out.println("C");
        }
    }
}
