package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariSiralama {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen dizinin eleman sayısını giriniz : "); // Dizinin eleman sayısını kullanıcadan alıyoruz.
        n = input.nextInt();
        int[] array =new int[n] ;
        for (int i =0;i<n;i++){
            System.out.println("Lütfen dizinin elemanlarını giriniz : ");//Döngü yardımı ile dizinin elemanlarını kullanıcıdan alıyoruz.
            array[i]=input.nextInt();

        }
        Arrays.sort(array);//Array sort metodu ile dizi küçükten büyüge sıralanıyor.
        System.out.println("Dizinin küçükten büyüğe sıralı hali = "+Arrays.toString(array));//to string metodu ile sıralanmış diziyi ekrana bastrıyoruz.

    }
}
