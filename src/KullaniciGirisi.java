import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, hataliGiris, sifre = "12345", kullaniciAdi = "patika", yeniSifre;
        int select;

        System.out.println("Sisteme giriş için kullanıcı adınızı giriniz : ");
        userName = input.nextLine();

        System.out.println("Şifrenizi giriniz : ");
        password = input.nextLine();
        hataliGiris = password;

        if (userName.equals(kullaniciAdi) && password.equals(sifre)) {
            System.out.println("Sisteme giriş yaptınız.");
        } else if (userName.equals(kullaniciAdi)) {
            System.out.println("Hatali şifre girdiniz sıfırlamak için 1 i tuşlayınız");
            select = input.nextInt();
            if (select == 1) {
                System.out.println("Lütfen yeni şifrenizi giriniz");
                input.nextLine();
                yeniSifre = input.nextLine();
                while (yeniSifre.equals(hataliGiris) || yeniSifre.equals(sifre)) {

                    System.out.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz");
                    yeniSifre = input.nextLine();


                }
                sifre = yeniSifre;
                System.out.println("Şifre olusturuldu.Şifreniz : " + sifre);
            } else {
                System.out.println("Çıkış yapılıyor.");
                System.exit(0);
            }
        } else {
            System.out.println("Hatalı kullanıcı adı veya parola.");
        }

    }
}
