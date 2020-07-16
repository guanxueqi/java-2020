package work20200713;
//3.分别用for、while、do-while求1-100的和（包含1和100）
public class dowhile1 {
    public static void main(String[] args) {
        int x=1;
        int y=0;
        do {
            y=y+x;
            x++;
        }while (x<100);
    System.out.println(y);}
}
