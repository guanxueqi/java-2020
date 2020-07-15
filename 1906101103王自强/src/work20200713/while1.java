package work20200713;
//3.分别用for、while、do-while求1-100的和（包含1和100）
public class while1 {
    public static void main(String[] args) {
        int x=1;
        int y=0;
        while (x<100){
            y=y+x;
            x++;
        }
    System.out.println(y);
    }
}
