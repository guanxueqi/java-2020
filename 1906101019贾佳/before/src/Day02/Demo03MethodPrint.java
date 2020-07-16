package Day02;

import Basement.HelloWorld;

//打印固定次数HelloWorld
public class Demo03MethodPrint {
    public static void main(String[] args){
        printCount(10);
    }
    public static void printCount(int num){
        //法一
//        int i = 0;
//        while (i<num){
//            System.out.println("Helloworld"+i);
//            i++;
//        }
        //法二
//        for (int j = 0; j < num; j++) {
//            System.out.println("Hello"+j);
        //法三
        int i =0;
        do{
            System.out.println("HelloWorld"+i);
            i++;
        }while (i<num);

        }

}

