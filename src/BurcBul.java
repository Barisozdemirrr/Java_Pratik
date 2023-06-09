import java.util.Scanner;

public class BurcBul {
    public static void main(String[] args) {
        int day, mount;//gün ve ay degişkenleri oluşturuldu
        String burc;//burc degişkeni oluşturuldu
        Scanner input = new Scanner(System.in);
        System.out.println("Burç bulma programına hoş geldiniz.");
        System.out.println("Lütfen dogum ayınızı sayı cinsinden giriniz.");
        mount = input.nextInt();//ay degeri alındı
        System.out.println("Lütfen dogum dogum gününüzü sayı cinsinden giriniz.");
        day = input.nextInt();//gün degeri alındı

        if (mount == 1 && day >= 1 && day <= 31) {//Ocak ayı için olabilecek senaryolar kısmı
            if (day < 22) {
                burc = "Oglak";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Kova";
                System.out.println("Burcunuz : " + burc);

            }
        } else if (mount == 2 && day >= 1 && day <= 29) {//Şubat ayı için olabilecek senaryolar kısmı
            if (day < 20) {
                burc = "Kova";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Balık";
                System.out.println("Burcunuz : " + burc);

            }

        } else if (mount == 3 && day >= 1 && day <= 31) {//Mart ayı için olabilecek senaryolar kısmı
            if (day < 21) {
                burc = "Balık";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Koç";
                System.out.println("Burcunuz : " + burc);


            }
        } else if (mount == 4 && day >= 1 && day <= 30) {//Nisan ayı için olabilecek senaryolar kısmı
            if (day < 21) {
                burc = "Koç";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Boga";
                System.out.println("Burcunuz : " + burc);


            }
        } else if (mount == 5 && day >= 1 && day <= 31) {//Mayıs ayı için olabilecek senaryolar kısmı
            if (day < 22) {
                burc = "Boga";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "İkizler";
                System.out.println("Burcunuz : " + burc);
            }
        } else if (mount == 6 && day >= 1 && day <= 30) {//Haziran ayı için olabilecek senaryolar kısmı
            if (day < 23) {
                burc = "İkizler";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Yengeç";
                System.out.println("Burcunuz : " + burc);
            }
        } else if (mount == 7 && day >= 1 && day <= 31) {//Temmuz ayı için olabilecek senaryolar kısmı
            if (day < 23) {
                burc = "Yengeç";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Aslan";
                System.out.println("Burcunuz : " + burc);
            }
        } else if (mount == 8 && day >= 1 && day <= 31) {//Agustos ayı için olabilecek senaryolar kısmı
            if (day < 23) {
                burc = "Aslan";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Başak";
                System.out.println("Burcunuz : " + burc);
            }
        } else if (mount == 9 && day >= 1 && day <= 30) {//Eylül ayı için olabilecek senaryolar kısmı
            if (day < 23) {
                burc = "Başak";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Terazi";
                System.out.println("Burcunuz : " + burc);
            }
        } else if (mount == 10 && day >= 1 && day <= 31) {//Ekim ayı için olabilecek senaryolar kısmı
            if (day < 23) {
                burc = "Terazi";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Akrep";
                System.out.println("Burcunuz : " + burc);
            }
        } else if (mount == 11 && day >= 1 && day <= 30) {//Kasım ayı için olabilecek senaryolar kısmı
            if (day < 22) {
                burc = "Akrep";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Yay";
                System.out.println("Burcunuz : " + burc);
            }
        } else if (mount == 12 && day >= 1 && day <= 31) {//Aralık ayı için olabilecek senaryolar kısmı
            if (day < 22) {
                burc = "Yay";
                System.out.println("Burcunuz : " + burc);
            } else {
                burc = "Oglak";
                System.out.println("Burcunuz : " + burc);
            }
        } else {//Hiçbir koşula girmedigi zaman oluşan senaryo
            System.out.println("Geçersiz gün veya ay girişi lütfen tekrar deneyiniz.");
        }
    }
}










