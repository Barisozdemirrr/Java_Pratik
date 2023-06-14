package Employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {//Kurucu metot.
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax() { //Vergi hesabı maaş 1000 den küçükse vergiden muaf büyükse yüzde 3 vergi
        if (this.salary <= 1000) {
            return this.salary;

        } else {
            return this.salary * 0.03;
        }

    }

    double bonus() {//Haftalık çalışma saati 40 dan fazla ise saat başı 30 tl degilse 0 tl bonus
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }


        return 0;
    }

    double raiseSalary() {// Çalışanın çalışma yılına göre zam artışının yapıldıgı metot.
        if (2021 - this.hireYear < 10) {
            return salary * 0.05;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return salary * 0.1;
        } else if (2021 - this.hireYear > 19) {
            return salary * 0.15;

        }

        return 0;
    }
    void employeeInfo(){// Çalışan hakkındaki bilgilerin ekrana basıldıgı metot
        System.out.println("İsim Soyisim = "+this.name);
        System.out.println("Maaş = "+this.salary);
        System.out.println("Haftalık çalışma saati = "+this.workHours);
        System.out.println("İşe başlangıç yılı = "+this.hireYear);
        System.out.println("Vergi = "+tax());
        System.out.println("Bonus = "+bonus());
        System.out.println("Maaş artışı = "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş = "+((this.salary+bonus())-tax()));
        System.out.println("Toplam maaş = "+(this.salary+raiseSalary()));

    }
}
