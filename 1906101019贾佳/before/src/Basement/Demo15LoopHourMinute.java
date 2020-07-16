package Basement;

public class Demo15LoopHourMinute {
    public static void main(String[] args){
        for(int hour = 0;hour<24;hour++){//外层控制小时
            for (int minute = 0;minute<60;minute++){//内层控制分钟
                for (int second = 0;second<60;second++){
                    System.out.println(hour+"点"+minute+"分"+second+"秒");
                }
            }

        }
    }
}
