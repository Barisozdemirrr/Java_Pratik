import java.util.Scanner;

public class PalindromSayi {

    static String palindrom(int number){
        int temp,reverseNumber=0,lastNumber;
        temp=number;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }if (number==reverseNumber){
            return "Girdiginiz sayı polindrom sayıdır";
        }else {
            return "Girdiginiz sayı polindrom sayı degildir";
        }

    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen polindrom testi için tam sayı giriniz : ");
        number=input.nextInt();
        System.out.println(palindrom(number));


    }
}
