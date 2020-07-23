package Test0723;

public class Doctor extends Person{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getEnvironment() {
        return super.getEnvironment();
    }

    @Override
    public void setEnvironment(String environment) {
        super.setEnvironment(environment);
    }

    @Override
    public String getSpeciality() {
        return super.getSpeciality();
    }

    @Override
    public void setSpeciality(String speciality) {
        super.setSpeciality(speciality);
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void ability() {
        super.ability();
        System.out.println("空余时间在诊所上班");
    }

    @Override
    public void introduction() {
        super.introduction();
    }

    public void duty(){
        System.out.println("治病救人是我的指责");
    }
}
