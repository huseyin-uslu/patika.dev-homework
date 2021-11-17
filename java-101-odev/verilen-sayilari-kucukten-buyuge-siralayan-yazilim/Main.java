package com.huseyinuslu.java101;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /**
     * Kucukten Buyuge dizen program
     * @Author Huseyin Uslu
     * @Since 17.11.2021
     */

    private static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {

        System.out.println("Merhaba kaç tane sayiyi kucukten buyuyege sıralamak istersiniz?");
        int istenecekSayi = new Scanner(System.in).nextInt();

     for(int i = 0;i < istenecekSayi;i++){
         getNumber(i);
     }
     calculate();}

    private static void getNumber(int index){
        System.out.print("" + (index + 1) + "." + " sayiyi giriniz: ");
        list.add(index,new Scanner(System.in).nextInt());
    }

    private static void calculate(){
        System.out.print("\n sayilarimiz: " + list);
        System.out.println(" Hesaplamak ister misiniz? \n evet: e \n hayir: h \n");
        String reply = new Scanner(System.in).next();

        if(reply.equals("e")){
           List<Integer> stream = list.stream().sorted().collect(Collectors.toList());
           list.clear();
           list.addAll(stream);
           System.out.print("sonuc :" + " " + list);
        }else if(reply.equals("h")){
            System.out.println("tekrar baslayalim o zaman \n \n");
            main(null);
        }else{
            calculate();
        }
    }

}


