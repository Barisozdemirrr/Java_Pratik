package OgrenciNotSistemi;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int performanceNote;
    Teacher teacher;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int performanceNote = 0;

    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Ögretmen ve ders bölümleri uyuşmuyor!");
        }


    }

    void printTeacherInfo() {
        this.teacher.print();


    }

}
