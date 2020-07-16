package Class;

public class Person {
    String name;
    private int age;
    public void show(){
        System.out.println("我叫："+name+",年龄："+age);
    }
    public void setAge(int num){
        if (num>0 && num<100){
             age = num;
        }else{
            System.out.println("数值不合理");
        }

    }
    //这个成员方法
    public int getAge() {
        return age;
    }
}
