package day0713作业;

public class Task01 {
    public static void main(String[] args) {

        int grade=100;

        if(grade>85 && grade<=100){
            System.out.println("A");
        }else if(grade>70 && grade<=85){
            System.out.println("B");
        }else if(grade>55 && grade<=70){
            System.out.println("C");
        }else if(grade>=0 && grade<=55){
            System.out.println("D");
        }else{
            System.out.println("不符合条件");
        }
    }

}
