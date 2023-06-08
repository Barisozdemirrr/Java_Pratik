import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        int balance = 2000;
        int right = 3;
        Scanner input = new Scanner(System.in);
        int select, price;

        while (right > 0) {
            System.out.print("Lütfen kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.print("Lütfen şifrenizi giriniz : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("12345")){
                System.out.println("Patika Bankasına Hoşgeldiniz");
                do {
                System.out.println("""
                        1-Para Yatırma
                        2-Para Çekme
                        3-Bakiye Sorgulama
                        4-Çıkış Yap"""
                );
                select = input.nextInt();
                switch (select) {
                    case 1 -> {
                        System.out.println("Lütfen yatırmak istediginiz para miktarını giriniz");
                        price = input.nextInt();
                        balance += price;
                        System.out.println("Yatırma işlmei başarılı şuanki bakiyeniz : " + balance);
                    }
                    case 2 -> {
                        System.out.println("Lütfen çekmek istediginiz para miktarını giriniz");
                        price = input.nextInt();
                        if (balance < price) {
                            System.out.println("Yetersiz Bakiye!");
                        } else {
                            balance -= price;
                        }
                    }
                    case 3 -> System.out.println("Bakiyeniz : " + balance);
                    case 4 ->{
                        System.out.println("Bizi tercih ettiginiz için teşekkürler. Görüşmek üzere :) :) ");
                    System.exit(0);}
                    default -> {
                    }
                }


            }while (true);
            }
                else{
                --right;
                System.out.println("Kullanıcı adınız veya şifreniz yanlış. Lütfen tekrar deneyiniz!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz!");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }


        }
    }}

