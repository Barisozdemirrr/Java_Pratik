import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k, toplam = 1;
        System.out.println("Lütfen üssünü bulmak istediginiz sayıyı giriniz : ");
        n = input.nextInt();
        System.out.println("Lütfen sayının üssünü giriniz  : ");
        k = input.nextInt();
        for (int i = 1; i <= k; i++) {
            toplam *= n;
        }
        System.out.println(toplam);


    }
}
