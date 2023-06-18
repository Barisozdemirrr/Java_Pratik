import java.util.Scanner;

public class PalindromikKelimeBulma {
    static void isPalindrome(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }

        if (str.contentEquals(reverse))
            System.out.println("Girdiginiz kelime palindromiktir");
        else
            System.out.println("Girdiginiz kelime palindromik degildir.");
    }

    public static void main(String[] args) {
        String a;
        Scanner input = new Scanner(System.in);
        System.out.println("Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime " +
                "\"Palindromik Kelime'dir\".");
        System.out.println("Lütfen palindromik testi için bir kelime giriniz : ");

        a = input.next();
        isPalindrome(a);

    }
}

