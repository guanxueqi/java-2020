package 第一次作业;

public class IfElse {
    public static void main(String[] args) {
        IfElse();
        Operator();
        For();
        While();
        Dowhile();

    }
    public static void IfElse(){
        int score = 90;
        if(score>85&&score<=100) {
            System.out.println("A");
        }else if(score<=85&&score>70){
            System.out.println("B");
        }else if(score<=70&&score>=55){
            System.out.println("C");
        }else if(score<55){
            System.out.println("D");
        }else {
            System.out.println("输入数值错误");
        }
    }
    public static void Operator(){
        int x = 10;
        int y = 20;
        int max = x>y?x:y;
        System.out.println(max);
    }
    public static void For(){
        int sum = 0;
        for(int i =0;i<101;i++){
            sum += i;
            System.out.println(sum);
        }
    }
    public static void While(){
        int j = 0;
        int sumup = 0;
        while(j<100){
            j ++;
            sumup += j;
            System.out.println(sumup);


        }
    }
    public static void  Dowhile(){
        int k = 0;
        int count = 0;
        do{
            k++;
            count += k;
            System.out.println(count);
        }while(k<100);
    }




}
