package Array;

public class Demo09ArrayReverse {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        for(int min = 0,max=array.length-1;min<max;min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;

        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
