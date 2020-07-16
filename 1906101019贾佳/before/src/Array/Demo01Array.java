package Array;

public class Demo01Array {
    public static void main(String[] args) {
        //动态初始化创建格式
        //数据类型[ ]数组名称= new 数据类型[数组长度];
        int [] arrayA = new int[300];

        double [] arrayB = new double[10];
        String [] arrayC = new String[5];
        //静态初始化
        //数据类型[ ] 数组名称= new数据类型[ ] {元素1,元素2，... };
        int [] arrayS = new int[]{1,2,4,5,7};

        String [] arrayJ = new String[]{"hello","world","wonder"};
    }
}
