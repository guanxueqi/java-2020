package Day02;
//一到一百求和
public class Demo02MethodSum {
    public static void main(String[] args){
        int sum = HundredSum();
        System.out.println(sum);
    }
    public static int HundredSum(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum  +i;
        }
        return sum;
    }
}
