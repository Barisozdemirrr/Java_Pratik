import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int a,b,i=1;
        int ebob=1,ekok=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ebob ve ekok degerleri için 1.sayiyi giriniz :");
        a=input.nextInt();
        System.out.println("Lütfen ebob ve ekok degerleri için 2.sayiyi giriniz :");
        b=input.nextInt();
        while(i<=a){
            if (a%i==0 && b%i==0){
                ebob=i;

            }
            i++;
        }
        System.out.println("Sayıların ebob u : "+ebob);
        while (i<=a*b){
            if (i%a==0 && i%b==0){
                ekok=i;
                break;
            }
            i++;
        }
        System.out.println("Sayıların ekok u : "+ekok);

}}
