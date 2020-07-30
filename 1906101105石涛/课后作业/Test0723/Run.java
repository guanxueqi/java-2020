package Test0723;

public class Run {
    public static void main(String[] args){
        //医生
        Doctor doctor=new Doctor();
        doctor.setName("fhrdr");
        doctor.setId(1906101105);
        doctor.setEnvironment("医院");
        doctor.setSpeciality("治病");
        //老师
        Teacher teacher=new Teacher();
        teacher.setName("ST-one");
        teacher.setId(12138);
        teacher.setEnvironment("学校");
        teacher.setSpeciality("教书");

        //运行
        doctor.ability();
        doctor.introduction();
        doctor.work();
        doctor.duty();

        teacher.ability();
        teacher.introduction();
        teacher.work();
    }
}
