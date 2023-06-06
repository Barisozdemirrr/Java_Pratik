import java.util.Scanner;

public class FaktoriyelOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        long toplamN = 1, toplamR = 1, toplamFark = 1, sonuc;
        System.out.println("Lütfen kombinasyon için n sayısını giriniz : ");
        n = input.nextInt();
        System.out.println("Lütfen kombinasyon için r sayısını giriniz : ");
        r = input.nextInt();
        for (int i = 1; i <= n; i++) { //n faktoriyel
            toplamN *= i;
        }
        for (int i = 1; i <= r; i++) { //r faktoriyel
            toplamR *= i;
        }
        for (int i = 1; i <= n - r; i++) { //n-r faktoriyel
            toplamFark *= i;
        }
        sonuc = toplamN / (toplamR * toplamFark);
        System.out.println("n nin r li kombinasyonu : " + sonuc);

    }
}
