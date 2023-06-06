import java.util.Scanner;

public class BasamakSayiToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayılarının toplamını ögrenmek için sayı giriniz : ");
        int number = input.nextInt();
        int basValue;
        int tempNumber = number;
        int toplam = 0;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            toplam += basValue;
            tempNumber /= 10;
        }
        System.out.println("Basamak sayılarının toplamı : "+toplam);


    }
}
