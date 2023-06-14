package BoksOyunu;

public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Ali", 18, 100, 85, 60);
        Fighter f2 = new Fighter("Mehmet", 15, 120, 100, 50);
        //Dövüşçüler f1 ve f2 olarak dövüşçü sınıfından oluşturuldu.
        Match match = new Match(f1, f2, 85, 100);
        // Match sınıfından match nesnesi oluşturuldu istenen parametler yazıldı
        match.run();
        //run metodu ile boks maçı başlıyor :)
    }
}
