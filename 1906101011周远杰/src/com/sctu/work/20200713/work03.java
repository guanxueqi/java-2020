package 20200713;
//3.分别用for、while、do-while求1-100的和（包含1和100）
public class work03{
    public static void main(String[] args) {
        int sum1=0;
        for (int i=1;i<101;i++){
            sum1=sum1+i;
        }
        System.out.println(sum1);

        int sum2=0;
        int m=1;
        while (m<101){
            sum2=sum2+m;
            m++;
        }
        System.out.println(sum2);

        int sum3=0;
        int n=1;
        do {
            sum3=sum3+n;
            n++;
        }while (n<101);
        System.out.println(sum3);
    }
}
