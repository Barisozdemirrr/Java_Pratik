import java.util.Scanner;

public class SicaklikEtkinlik {
    public static void main(String[] args) {

        int temperatureValue;//sıcaklık degişkeni oluşturuldu.
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen sıcaklık degerini giriniz");
        temperatureValue = input.nextInt();//kullanıcıdan sıcaklık degeri alındı

        if (temperatureValue < 5) {//durumlara göre kullanıcıya öneriler sunuldu.
            System.out.println("Kayak yapmak için çok güzel bir hava :)");
        } else if (temperatureValue <= 15) {
            System.out.println("Sinemaya gitmek için çok güzel bir hava :)");
        } else if (temperatureValue <= 25) {
            System.out.println("Piknige gitmek için çok güzel bir hava :)");
        } else {
            System.out.println("Yüzmeye gitmek için çok güzel bir hava :)");

        }
    }
}
