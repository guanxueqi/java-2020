package Basement;

public class Demo14Continue {
    public static void main(String[] args){
       for(int i = 1;i <= 10;i++){
           if(i==4){
               continue;
           }
           System.out.println(i+"层到了");
       }
    }
}
