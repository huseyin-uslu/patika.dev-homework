package com.huseyinuslu.java101;

import java.util.Scanner;
public class Main {
    /**
     * Sicakliga Gore Etkinlik Oneren Uygulama
     */

    public static void main(String[] args) {

        while (true) {
            System.out.print("Sicaklik degerini giriniz: ");
            int sicaklik = new Scanner(System.in).nextInt();
          //  firstMethod(sicaklik);
           // secondMethod(sicaklik);
            thirdMethod(sicaklik);
        }

    }

    private static void firstMethod(int sicaklik) {
        if (sicaklik > 5) {
            if (sicaklik < 25) {
                if (sicaklik < 15) {
                    System.out.println("sinema");
                } else {
                    // x > 15
                    System.out.println("piknik");
                }
            } else {
                System.out.println("yuzme");
            }
        } else {
            System.out.println("kayak");
        }
    }

    private static void secondMethod(int sicaklik) {
        if (sicaklik > 5 && sicaklik < 25) {
            if (sicaklik <= 15) {
                System.out.println("sinema");
            } else {
                System.out.println("piknik");
            }
        } else {
            if (sicaklik <= 5) {
                System.out.println("kayak");
            } else {
                System.out.println("yuzme");
            }
        }
    }

    private static void thirdMethod(int sicaklik){
        boolean preference = sicaklik < 25;
        if(!preference){
            System.out.println("yüzme");
            return;
        }
        boolean preference2 = sicaklik < 15;
        if(!preference2){
            System.out.println("piknik");
            return;
        }
        boolean preference3 = sicaklik < 5;
        if(!preference3) {
            System.out.println("sinema");
            return;
        }
        if(preference3){
            System.out.println("kayak");
            return;
        }

    }
}


