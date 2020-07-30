import java.util.ArrayList;
public class ArrayList使用 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
//        按顺序添加添加：add
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("顺序添加："+list);

//        插入添加：
        list.add(1,"m");
        System.out.println("插入添加："+list);

//        将一个arraylist中的数据添加到另一个arraylist中：addAll
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("d");
        list1.add("e");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("f");
        list2.add("g");
//        将list2添加到list1中
        list1.addAll(list2);
        System.out.println(list1);

//        将一个ArrayList中的所有数据添加到另一个ArrayList中的地N个元素之后
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("x");
        list3.add("y");
        ArrayList<String> list4 = new ArrayList<String>();
        list4.add("i");
        list4.add("j");

        list3.addAll(1,list4);
        System.out.println(list3);

//        删除：remove
        list3.remove(3);
        list3.remove("j");
        System.out.println(list3);

//        同时删除多个数据:removeAll;此处按照list6中的数据在list5中删除
        ArrayList<String> list5 = new ArrayList<String>();
        list5.add("1");
        list5.add("2");
        list5.add("3");
        list5.add("4");
        ArrayList<String> list6 = new ArrayList<String>();
        list6.add("1");
        list6.add("2");
        list5.removeAll(list6);
        System.out.println(list5);

//        清空：clear
        list5.clear();
        System.out.println(list5);

//        修改：set
        ArrayList<String> list7 = new ArrayList<String>();
        list7.add("5");
        list7.add("6");
        list7.add("7");
        list7.add("8");
        list7.set(2,"99");
        System.out.println(list7);

//        查询：get
        ArrayList<String> list8 = new ArrayList<String>();
        list8.add("10");
        list8.add("20");
        list8.add("30");
//        获取第二个元素
        String result=list8.get(2);
        System.out.println("第二个元素是："+result);
    }
}
