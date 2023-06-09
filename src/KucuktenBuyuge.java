import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        int a, b, c;//kullanıcıdan alınacak degişkenler oluşturuldu
        Scanner input = new Scanner(System.in);

        System.out.println("Küçükten büyüge sıralama uygulamasına hoş geldiniz.");
        System.out.println("Lütfen 1. sayiyi giriniz");
        a = input.nextInt();//1.degiken alındı

        System.out.println("Lütfen 2. sayiyi giriniz");
        b = input.nextInt();//2.degişken alındı

        System.out.println("Lütfen 3. sayiyi giriniz");
        c = input.nextInt();//3.degişken alındı

        if (a < b && a < c) {//en küçük a olan koşul
            if (b < c) {
                System.out.println(a + "<" + b + "<" + c);
            } else {
                System.out.println(a + "<" + c + "<" + b);
            }
        }
        if (b < a && b < c) {//en küçük b olan koşul
            if (a < c) {
                System.out.println(b + "<" + a + "<" + c);
            } else {
                System.out.println(b + "<" + c + "<" + a);
            }


        }
        if (c < b && c < a) {//en küçük c olan koşul
            if (b < a) {
                System.out.println(c + "<" + b + "<" + a);
            } else {
                System.out.println(c + "<" + a + "<" + b);
            }
        }
    }
}
