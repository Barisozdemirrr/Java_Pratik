package OgrenciNotSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Kemal", "555", "MAT");
        Teacher t2 = new Teacher("Mahmut", "444", "FZK");
        Teacher t3 = new Teacher("Ekrem", "333", "KMY");


        Course mat = new Course("Matematik", "101", "MAT", t1);
        mat.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK", t2);
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya", "103", "KMY", t3);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ahmet", "01", "4", mat, fizik, kimya);
        s1.addBulkExamNote(100, 50, 200, 50, 60, 80);
        s1.isPass();

        Student s2 = new Student("Mehmet", "02", "4", mat, fizik, kimya);
        s2.addBulkExamNote(80, 70, 90, 100, 100, 100);
        s2.isPass();


    }

}
