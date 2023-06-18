package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanlariSiralama {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen dizinin eleman sayısını giriniz : ");
        n = input.nextInt();
        int[] array =new int[n] ;
        for (int i =0;i<n;i++){
            System.out.println("Lütfen dizinin elemanlarını giriniz : ");
            array[i]=input.nextInt();

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
