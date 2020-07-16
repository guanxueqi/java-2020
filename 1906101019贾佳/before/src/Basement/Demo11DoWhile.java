package Basement;

public class Demo11DoWhile {
    public static void main(String[] args){
        for(int i = 1;i <= 10;i++){
            System.out.println("for循环"+i);
        }
        int i = 1;
        do{
            System.out.println("do-while循环");
            i++;
        }while(i<=10);
    }
}
