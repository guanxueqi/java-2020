/*
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
public class Test723 {
    public class Person{
        private String name;
        private int id;
        private String environment;
        private String speciality;

        public void name(){
            System.out.println(name);
        }

        public void id(){
            System.out.println(id);
        }

        public void Environment(){
            System.out.println(environment);
        }

        public void speciality(){
            System.out.println(speciality);
        }

        public void work(){
            System.out.println(name+"在"+environment+"工作");
        }

        public void ability(){
            System.out.println(name+"我会"+speciality);
        }

        public void introduction(){
            System.out.println("大家好！我是"+id+"号"+name);
        }

    }

//    super在java的子类中指代父类引用
         public class Doctor extends Person{
         public void name(){
             System.out.println(super.name);
    }

         public void id(){
             System.out.println(super.id);
    }

         public void Environment(){
             System.out.println(super.environment);
    }

         public void speciality(){
             System.out.println(super.speciality);
    }

         public void work(){
             System.out.println(super.name+"在"+super.environment+"工作");
    }

         public void ability(){
             System.out.println("空余时间在诊所上班");
    }

         public void introduction(){
             System.out.println("大家好！我是"+super.id+"号"+super.name);
    }

         public void duty(){
             System.out.println("治病救人是我的责任");
    }

         public class Teacher extends Person{
             public void name(){
                 System.out.println(super.name);
        }

             public void id(){
                 System.out.println(super.id);
        }

        public void Environment(){
                 System.out.println(super.environment);
        }

        public void speciality(){
                 System.out.println(super.speciality);
        }

        public void work(){
                 System.out.println(super.name+"在"+super.environment+"工作");
        }

        public void ability(){
                 System.out.println(super.name+"我会"+super.speciality);
        }

        public void introduction(){
                 System.out.println("大家好！我是"+super.id+"号"+super.name);
        }
    }
}
}
