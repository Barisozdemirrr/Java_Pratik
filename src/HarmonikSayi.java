import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        double toplam = 0.0;
        System.out.println("Lüten Harmonik Serisini Bulmak istediginiz Sayıyı Giriniz : ");
        sayi = input.nextInt();
        for (double i = 1; i <= sayi; i++) {
            System.out.print(1.0 + "/" + i);
            System.out.print("+");
            System.out.println();
            toplam += (1.0 / i);

        }
        System.out.println("Sonuc : " + toplam);
    }
}
