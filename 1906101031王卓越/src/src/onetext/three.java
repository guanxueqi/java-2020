package onetext;

public class three {
    public static void main(String[] args) {
        int sums = 0;
        for (int i = 1; i < 101; i++){
            sums += i;
        }
        System.out.println( sums ); // for循环
        int sums_two = 0;
        int k = 0;
        while (k<101){
            sums_two += k;
            k++;
        }
        System.out.println( sums_two ); // while循环
        int sums_three = 0;
        int s = 0;
        do{
            sums_three += s;
            s ++;
        }while(s<101);
        System.out.println( sums_three ); //do-while循环
    }
}
