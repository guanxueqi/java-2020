package Array;

public class Demo10ArrayParam {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(array);//地址值
        printArray(array);
    }
    public static void printArray(int [] array){
        for(int i =0 ;i<array.length;i++){
            System.out.println(array);//地址值
            System.out.println(array[i]);
        }
    }
}
