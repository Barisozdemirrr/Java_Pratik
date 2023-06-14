package BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) { // Kurucu metot tanımlandı
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run() {
        if (isCheck()) { // check metodu ile sikletleri dövüş için uygun mu kontrol saglanıyor
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=========Yeni Round==========");
                if (whoStart() == 1) { //whostart metotundan 1 gelirse dövüşe f1 dövüşçüsü başlıyor
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) { // döngü içerisinde sürekli kazanan var mı diye kontrol ediliyor.

                        break;

                    }
                    this.f1.health = this.f2.hit(this.f1);
                } else { // Diger bir olasılık yani 0 gelirse dövüşe f2 dövüşçüsü başlıyor
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {

                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                }
                if (isWin()) {

                    break;
                }

                System.out.println(this.f1.name + " Sağlık " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık " + this.f2.health);


            }

        } else {
            System.out.println("Sporcuların sikletleri farklı  oldugu için dövüş yapılamaz.");
        }
    }

    boolean isCheck() { // Dövüşçülerin kiloları min ve max degerlere uygun mu bunun kontrolu bu metot da yapılıyor
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() { // Dövüşçülerden birinin canı 0 oldugunda kazanan belli oluyor.
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı.");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandı.");
            return true;
        }
        return false;
    }

    int whoStart() {  //Bu metot da yüzde 50 şans ile 1 veya 0 sayıları geliyor
        double startNumber = Math.random() * 100;
        if (startNumber <= 50) {
            return 1;
        } else {
            return 0;
        }
    }
}

