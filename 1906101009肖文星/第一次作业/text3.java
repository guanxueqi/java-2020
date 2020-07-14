package 第一次作业;

public class text3 {
    public static void main(String[] args) {
        int sum1=0;
        for(int a=1;a<101;a++){
            sum1+=a;
        }
        System.out.println("for:"+sum1);
        int sum2=0;
        int b=1;
        while (b<101){
            sum2+=b;
            b++;
        }
        System.out.println("while:"+sum2);
        int sum3=0;
        int c=1;
        do {
            sum3+=c;
            c++;
        }while (c<101);
        System.out.println("do while:"+sum3);
    }
}
