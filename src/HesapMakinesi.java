import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select,sayi1,sayi2;
        System.out.println("""
                Lütfen yapmak istediginiz işlemi seçiniz
                1-Toplama
                2-Çıkarma
                3-Çarpma
                4-Bölme""");
        select=input.nextInt();
        switch (select) {
            case 1 -> {
                System.out.println("Lütfen toplama işlemi için birinci ve ikinci sayı degerlerini giriniz");
                System.out.println("Birinci sayı : ");
                sayi1 = input.nextInt();
                System.out.println("İkinci sayı : ");
                sayi2 = input.nextInt();
                System.out.println("Sonuc : " + (sayi1 + sayi2));
            }
            case 2 -> {
                System.out.println("Lütfen Çıkarma işlemi için birinci ve ikinci sayı degerlerini giriniz");
                System.out.println("Birinci sayı : ");
                sayi1 = input.nextInt();
                System.out.println("İkinci sayı : ");
                sayi2 = input.nextInt();
                System.out.println("Sonuc : " + (sayi1 - sayi2));
            }
            case 3 -> {
                System.out.println("Lütfen Çarpma işlemi için birinci ve ikinci sayı degerlerini giriniz");
                System.out.println("Birinci sayı : ");
                sayi1 = input.nextInt();
                System.out.println("İkinci sayı : ");
                sayi2 = input.nextInt();
                System.out.println("Sonuc : " + (sayi1 * sayi2));
            }
            case 4 -> {
                System.out.println("Lütfen Bölme işlemi için birinci ve ikinci sayı degerlerini giriniz");
                System.out.println("Birinci sayı : ");
                sayi1 = input.nextInt();
                System.out.println("İkinci sayı : ");
                sayi2 = input.nextInt();
                if (sayi2!=0)
                System.out.println("Sonuc : " + (sayi1 / sayi2));
                else {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
            }
            default -> System.out.println("Yanlış bir seçim yaptınız.Lütfen tekrar deneyiniz");
        }
}}
