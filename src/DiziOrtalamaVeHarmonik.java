public class DiziOrtalamaVeHarmonik {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};//dizi oluşturuldu.
        int sum = 0;//dizideki elemanların toplanacagı degişken oluşturuldu.
        double harmonikSum = 0;//hermonik sayı formulu için degişken.
        for (int j : list) {// for döngüsü ile dizinin tüm elemanları sum degişkeninde toplandı
            sum += j;

        }
        System.out.println("Dizinin ortalaması = "+sum / list.length);//dizinin ortalaması için dizinin toplamı ile uzunlugu bölündü
        System.out.println("======================");
        for (double i = 1; i <= list.length; i++) {//Harmonik formül döngü ile oluşturuldu

            harmonikSum += (1.0/ i);
        }
        System.out.println("Dizinin harmonik ortalaması = "+(harmonikSum/ list.length));
        //Harmonik sayıların toplamı bölü dizinin uzunlugu bize ortalamayı verir.
    }
}
