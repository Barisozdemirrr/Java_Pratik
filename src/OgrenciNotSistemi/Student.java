package OgrenciNotSistemi;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;

    }

    void addBulkExamNote(int note1, int note2, int note3, int pnote, int pnote2, int pnote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.mat.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.fizik.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.kimya.note = note3;
        }
        if (pnote >= 0 && pnote <= 100) {
            this.mat.performanceNote = pnote;
        }
        if (pnote2 >= 0 && pnote2 <= 100) {
            this.fizik.performanceNote = pnote2;
        }
        if (pnote3 >= 0 && pnote3 <= 100) {
            this.kimya.performanceNote = pnote3;
        }


    }

    void isPass() {
        this.avarage = ((this.mat.note * 0.80) + (this.mat.performanceNote * 0.20) +
                (this.fizik.note * 0.80) + (this.fizik.performanceNote * 0.20) +
                (this.kimya.note * 0.80) + (this.kimya.performanceNote * 0.20)) / 3.0;
        if (this.avarage >= 55) {
            System.out.println("Sınıfı Geçtiniz :) " + "Ortalamanız : " + this.avarage);
        } else {
            System.out.println("Sınıfta kaldınız :( " + "Ortalamanız : " + this.avarage);
        }
        printNote();

    }

    void printNote() {
        System.out.println(this.mat.name + " Notu : " + this.mat.note);
        System.out.println(this.mat.name + " Sözlü Notu : " + this.mat.performanceNote);
        System.out.println(this.fizik.name + " Notu : " + this.fizik.note);
        System.out.println(this.fizik.name + " Sözlü Notu : " + this.fizik.performanceNote);
        System.out.println(this.kimya.name + " Notu : " + this.kimya.note);
        System.out.println(this.kimya.name + " Sözlü Notu : " + this.kimya.performanceNote);
    }

}
