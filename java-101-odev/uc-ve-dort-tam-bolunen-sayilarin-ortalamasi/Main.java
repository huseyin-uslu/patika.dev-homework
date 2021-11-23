package com.huseyinuslu.java101;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Double.POSITIVE_INFINITY;

public class Main {
    /**
     * Artık Yıl Hesaplayan Yazılım
     * @Author Huseyin Uslu
     * @Since 22.11.2021
     */

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Bir sayi giriniz: ");
       int typedNumber = input.nextInt(),toplam = 0,ortalama = 0,kacSayiVar = 0;

       for(int i = 1;i<=typedNumber;i++){
           int remain = i%12;
           boolean withoutAnyRemain = remain == 0;
           if(!withoutAnyRemain)
               continue;
           kacSayiVar++;
           toplam += i;
       }

       ortalama = toplam / kacSayiVar;

       System.out.println("" + typedNumber + " sayınızın" + " 3 ve 4'e tam bölünen toplam: " + kacSayiVar + " sayı var. \n" +
               "bulunan sayilarin toplaminin ortalamasi: " + ortalama);

    }
}




