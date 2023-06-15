package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public int max(int [] array) {//Dizideki en büyük sayıyı bulma metodu.
        int max = 0;

        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public int min(int [] array) {//Dizideki en küçük sayıyı bulma metodu.
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int closeMin=0;
        int closeMax=0;
        System.out.println("Dizinin eleman sayısını giriniz = ");
        n=input.nextInt();
        int [] array =new int[n];
        for (int i = 0;i<n;i++){
            System.out.println("Dizinin elemanlarını giriniz = ");
            array[i]=input.nextInt();

        }
        ArrayMinMax m = new ArrayMinMax();
        System.out.println("Dizinin en büyük elemanı = "+m.max(array));
        System.out.println("Dizinin en küçük elemanı = "+m.min(array));

        System.out.println("=========================");

        Arrays.sort(array);//Diziyi küçükten büyüge dogru sıralama metodu.
        System.out.println("Lütfen bir sayı giriniz");
        int number = input.nextInt();
        for (int i = array.length-1;i>=0;i--){//Dizi şuan küçükten büyüge sıralı.
            // Diziyi tersten yazdırınca girilen sayıdan küçük sayıyı buluyoruz ve buldugumuz an döngü kapanıyor.
            //Böylelikle girilen sayıdan küçük en yakın sayı bulunuyor.
            if (number>array[i]){
                closeMin=array[i];
                break;

            }



        }
        for (int j : array) {//Dizi sıralı oldugu için sayıdan büyük en yakın sayı bulunuyor
            // break komutu ile de döngü sonlanıyor.break kullanmazsak dizideki en büyük sayıyı bulmuş olurduk.
            if (number < j) {
                closeMax = j;
                break;
            }
        }
        System.out.println("Sayıdan küçük en yakın sayı = "+closeMin);
        System.out.println("Sayıdan büyük en yakın sayı = "+closeMax);





        }



    }

