package Test0723;
/*继承作业
请创建一个医生类(doctor)和一个教师类(teacher)继承父类person

共有的成员变量
名字(name)、编号(id)、工作环境(environment)、特长(speciality)。

共有成员方法
工作地点(work)、工作能力(ability)、自我介绍(introduction)
工作地点打印：name+"在"+environment+"工作"
工作能力打印：name+"我会"+specaility
自我介绍打印："大家好!我是"+id+"号"+name

医生类特有发方法
工作指责(duty) ==> 输出 "治病救人是我的指责"

医生类重写ability方法
工作地点方法：继承原方法的内容，并添加打印："空余时间在诊所上班"
*/

public class Person {
    private String name;
    private int id;
    private String environment;
    private String speciality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void work(){
        System.out.println(name+"在"+environment+"工作");
    }
    public void ability(){
        System.out.println(name+"我会"+speciality);
    }
    public void introduction(){
        System.out.println("大家好!我是"+id+"号"+name);
    }
}
