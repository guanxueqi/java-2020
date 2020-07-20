package Test20200720;

public class Test04 {
    public static void main(String[] args){
        String str1="光头强";
        String str2="光头强";
        //引用数据类型 == 是比较的地址
        System.out.println(str1==str2);
        System.out.println(System.identityHashCode(str1));//查询地址
        System.out.println(System.identityHashCode(str2));
    }
}
