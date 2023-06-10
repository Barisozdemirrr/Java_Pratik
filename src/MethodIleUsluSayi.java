import java.util.Scanner;

public class MethodIleUsluSayi {
    static void power(){
        int base, exponent,result=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen taban degerini giriniz : ");
        base =scan.nextInt();
        System.out.println("Lütfen üs degerini giriniz : ");
        exponent =scan.nextInt();
        for (int i =1;i<=exponent;i++){
            result*=base;
        }
        System.out.println("Sonuc : "+result);

    }
    public static void main(String[] args) {
        power();

    }
}
