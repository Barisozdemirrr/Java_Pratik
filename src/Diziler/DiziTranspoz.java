package Diziler;

import java.util.Scanner;

public class DiziTranspoz {
    public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("Dizinin satır sayısınız giriniz : ");
        int row = s.nextInt();
        System.out.println("Dizinin sütun sayısınız giriniz : ");
        int column = s.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Dizinin elemanlarını giriniz :");
        for (i = 0; i < row; i++)//Dizinin elemanları için kullanıcıdan aldıgımız satır ve sutün degerlerine göre
        {                       //döngü oluşrutup elemanları tek tek kullanıcdan alıyoruz.
            for (j = 0; j < column; j++) {
                array[i][j] = s.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("Dizinin matrisi :  ");//Dizinin elemanlarını yazdırıyoruz.
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Dizinin transpozu :  ");//Dizinin satır ve sutün  sayılarının yerini degiştirip yazdırınca
        for (i = 0; i < column; i++)                 //dizinin transpozunu elde etmiş oluyoruz.
        {
            for (j = 0; j < row; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
}