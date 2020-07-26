package Test20200720;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("光头大魔王");
        list.add("长毛程序员");
        list.add(0,"这里有两个人：");

        System.out.println(list);
    }
}
