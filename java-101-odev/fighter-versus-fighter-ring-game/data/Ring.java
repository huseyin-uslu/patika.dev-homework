package com.huseyinuslu.java101.data;
import com.huseyinuslu.java101.data.Fighter;
import java.util.Random;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                if(new Random().nextInt(2) == 0){ //order
                    f2.health = f1.hit(f2);
                    f1.health = f2.hit(f1);
                }else{
                    f1.health = f2.hit(f1);
                    f2.health = f1.hit(f2);
                }
                if (isWin()){
                    break;
                }

                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("Maçı Kazanan : " + f2.name + "\n" + f1.name + " is fainted.");
            return true;
        } else if (f2.health <= 0){
            System.out.println("Maçı Kazanan : " + f1.name + "\n" + f2.name + " is fainted.");
            return true;
        }
        return false; //default return
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
