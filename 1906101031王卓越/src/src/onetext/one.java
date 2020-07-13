package onetext;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int mark = s.nextInt();
        if (mark > 85 & mark <= 100){
            System.out.println(" A ");
        }
        if (mark > 70 & mark <= 85){
            System.out.println(" B ");
        }
        if (mark >= 55 & mark <= 70){
            System.out.println(" C ");
        }
        if (mark < 55){
            System.out.println(" D ");
        }
    }
}
