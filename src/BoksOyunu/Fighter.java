package BoksOyunu;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    int dodge;
    Fighter(String name, int damage,int health,int weight,int dodge){//Fighter sınıfının Kurucu metodu.
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
       if (dodge>=0 && dodge<=100){
           this.dodge=dodge;
       }else {
           this.dodge=0;
       }

    }
    int hit(Fighter foe){ // Dövüşçülerin birbilerine hasar vurdukları
        // ve hasar engelledikleri bunun kontrolunun yapıldıgı metot.
        System.out.println(this.name+" => "+foe.name+" "+this.damage+" Hasar vurdu !");
        if (foe.isDodge()){ // Gelen hasarın engellenip engellenmedigi kontrol ediliyor
            System.out.println(foe.name+" Gelen hasarı engelledi");
            System.out.println("=====================");
            return foe.health;
        }
        return Math.max(foe.health - this.damage, 0);


    }
    boolean isDodge(){ // Dövüşçünün dodge degerine göre hasar engelleme metodu.
        double randomNumber=Math.random()*100;
       return randomNumber<=this.dodge;

    }


}
