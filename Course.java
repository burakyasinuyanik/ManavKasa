public class Course {

    Teacher teacher;
    String name ;
    String code;
    String prefix;
    int note;
    int sozlu;


    Course (String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        note=0;
        sozlu=0;

    }

    void addTeacher(Teacher teacher){
        this.teacher=teacher;
        if (this.teacher.brach.equals(this.prefix)){
            this.teacher.teacInfo();
        }else System.out.println("Öğretmen ve Ders Bilgileri uyuşmamakta.");

    }
    void printTeacher(){


    }
}
