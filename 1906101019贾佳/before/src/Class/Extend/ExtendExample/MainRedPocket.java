package Class.Extend.ExtendExample;

import java.util.ArrayList;

public class MainRedPocket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manager.show();//100
        one.show();//0
        two.show();//0
        three.show();//0
        System.out.println("====================");

        //群主发20块钱，分三个红包
        ArrayList<Integer> redlist = manager.send(20,3);
        //三个普通成员去收红包
        one.recieve(redlist);
        two.recieve(redlist);
        three.recieve(redlist);

        manager.show();
        one.show();
        two.show();
        three.show();

    }
}
