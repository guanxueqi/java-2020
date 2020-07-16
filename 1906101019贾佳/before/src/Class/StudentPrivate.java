package Class;

public class StudentPrivate {
    private String name;
    private int age;
    private boolean male;
    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }
    public void setMale(boolean bool){
        male = bool;
    }
    public boolean isMale(){
        return male;
    }

}
