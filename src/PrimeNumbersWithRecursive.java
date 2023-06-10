import java.util.Scanner;

public class PrimeNumbersWithRecursive {
    static boolean isPrime(int n ,int i){
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)

            return true;

        return isPrime(n, i + 1);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Asal sayı testi için bir sayı giriniz : ");
        int n=scan.nextInt();
        if (isPrime(n,2)){
            System.out.println(n+" Asal sayıdır.");
        }else {
            System.out.println(n+" Asal sayı degildir.");
        }

    }
}
