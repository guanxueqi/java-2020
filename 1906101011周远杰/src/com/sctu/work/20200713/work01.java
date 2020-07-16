//1.根据输入的分数打印其对应的等级，85-100为A，70-85为B，55-70为C，55以下为D。
package 20200713;
public class work01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意分数：");
        int grade = scanner.nextInt();
        if (grade>85 && grade<=100){
            System.out.println('A');
        }
        else if (grade>70 && grade<=85){
            System.out.println('B');
        }
        else if (grade>55 && grade<=70){
            System.out.println('C');
        }
        else if (grade<=55){
            System.out.println('D')
        }
    }
}
