package Diziler;

import java.util.Arrays;

public class DiziFrekans {
    public static void main(String[] args) {
        int[] array = {1, 55, -5, 3, 99, 1, 88, 55, 1, 99, -5, 11, 12, -88, 3};
        Arrays.sort(array);//Dizi sıralandı
        int i, j, frequency;//Degişkenler oluşturuldu.

        for (i = 0; i < array.length; i++) {//Dizinin elemanlarını döndürme işlemi.
            frequency = 1;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) { //Dizideki elemanlar sıralandıgı için tekrar edenler yanyana  gelecek
                    frequency++;             //bu koşuldada bir sonraki ile eşit ise frekans bir artıyor.
                } else { // degilse bu döngü sonlanıyor ve frekans tekrar 1 olarak atanıyor.
                    break;
                }
            }
            i = j - 1;
            //Ekrana bulunan degerler bastırılıyor.
            System.out.println(array[i] + " sayısı  " + frequency + " kere tekrar edildi.");

        }
    }
}
