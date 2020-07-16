package Array;

public class Demo08ArrayMax {
    public static void main(String[] args) {
        int [] array = {12,23,234,234,234,5,1121,312313,324234345,56456467};
        int max = array[0];
        for (int i = 1;i<array.length;i++){
            if(array[i]>max)
                max = array[i];

        }
        System.out.println("最大值"+max);
        int min = array[0] ;
        for(int i = 0 ;i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("最小值"+min);
    }
}
