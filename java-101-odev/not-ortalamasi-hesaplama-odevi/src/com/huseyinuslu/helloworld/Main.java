package com.huseyinuslu.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ArrayList<Integer> dersNotlari = new ArrayList<>(); //puanlari tuttugum array.
        String[] dersler = {"fizik","kimya","turkce","tarih","muzik"}; //dersleri tuttugum array

       for(int i = 0;i < dersler.length;i++){
            System.out.print(dersler[i] + " notunuz : ");
           dersNotlari.add(new Scanner(System.in).nextInt());
        }

       short toplam = 0; // short
       byte ortalama = 0; // -128 - 127

       for(int s : dersNotlari){
           toplam += s; //ekleme toplama
       }

       ortalama = (byte) /* Byte'a cevirdim. Hafiza icin.. */ (toplam / dersNotlari.size());

        boolean sinifiGectimMi = ortalama > 60; //Koşul ifadesi
        String sonuc = sinifiGectimMi ? "Sınıfı geçtiniz." : "Maalesef, sınıfta kaldınız."; //tenary

       System.out.println("ortalamanız = " + ortalama + "\n" + " sonuç = " + sonuc);

    }
}