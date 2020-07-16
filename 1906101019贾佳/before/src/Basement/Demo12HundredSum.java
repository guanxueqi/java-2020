package Basement;

public class Demo12HundredSum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            i++;
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(sum);
            } else {
                continue;
            }
        }
        qiuhe();
        dowhile();
    }
    public static void qiuhe(){
        int sum = 0;
        for(int s = 1;s <= 100;s++){
            if(s % 2 == 0){
                sum += s;
            }

            System.out.println(sum);
        }
    }
    public static void dowhile(){
        int sum = 0 ;
        int i = 1;
        do {
            i++;
            if(i%2==0){
                sum += i;
                System.out.println(sum);
            }
        }while(i<=100);

    }
}

