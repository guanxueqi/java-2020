package Class.Extend.ExtendExample;

import java.util.ArrayList;

public class Manager extends User{

    public Manager(){

    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储红包金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看一下自己的金额
        int leftMoney = super.getMoney();//群主当前余额
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        //扣钱，其实就是重新设定余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需要拆分成为count份
        int avg = totalMoney / count;
        int mod = totalMoney%count;//余数，也就是甩下的零头
        //初不开的零头，包在最后一个红包当中
        //把红包一个个放到集合中
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);

        }
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
