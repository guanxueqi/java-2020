package Test20200720;

public class Test05 {
    public static void main(String[] args){
        String str1="666";
        System.out.println(str1.equals("哈哈")); //不推荐
        System.out.println("哈哈".equals(str1)); //推荐写法
        /*
        String str2=null;
        System.out.println("哈哈".equals(str2));
        */

        //字符串的截取
        String str3="光头大魔王";
        System.out.println(str3.substring(3));
        System.out.println(str3.substring(3,5));

        //字符串的替换
        System.out.println(str3.replace("光头大魔王","开飞船的大哥哥"));

        //split的使用
        for(int i=0;i<2;i++){
            System.out.println(str3.split("大")[i]);
        }
    }
}
