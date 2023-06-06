import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int sayi,toplam=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen faktoriyelini bulmak istediginiz sayıyı giriniz : ");
        sayi=input.nextInt();
        for (int i =1;i<=sayi;i++){
            toplam*=i;


        }
        System.out.println(toplam);
    }
}