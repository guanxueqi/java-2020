package 20200713;
//2.输入两个值x和y,使用三元运算符打印其中最大值
public class work02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int max= x>y? x:y;
        System.out.println(max);
    }
}