package com.huseyinuslu.java101;

import java.util.*;

public class Main {
    /**
     * Burc Bulan Program
     * @Author Huseyin Uslu
     * @Since 18.11.2021
     */

    public static void main(String[] args) {
        int ay,gun;

        ay  = isAnswerInCorrectWay(1,12, "Kacinci ayda dogdunuz: ");
        gun = isAnswerInCorrectWay(1,31,"Ayin kacinci gunu dogdunuz: ");

        System.out.print("sizin burcunuz: " + burcuAl(ay,gun));


    }

    private static int isAnswerInCorrectWay(int from,int to,String question){
        System.out.print(question);
        int value = new Scanner(System.in).nextInt();
        if(from > value || to < value){
            System.out.println("gecersiz deger lutfen dogru bir deger giriniz.");
           return isAnswerInCorrectWay(from, to,question);
        }else{
            return value;
        }
    }

    private static String burcuAl(int ay, int gun){
        if(ay == 1){
            if(onceMiSonraMi(gun)){
                return "OGLAK BURCU";
            }else{
                return "KOVA BURCU";
            }
        }else if(ay == 2){
            if(onceMiSonraMi(gun)){
                return "KOVA BURCU";
            }else{
                return "BALIK BURCU";
            }
        }
        else if(ay == 3){
            if(onceMiSonraMi(gun)){
                return "BALIK BURCU";
            }else{
                return "KOC BURCU";
            }
        }
        else if(ay == 4){
            if(onceMiSonraMi(gun)){
                return "KOC BURCU";
            }else{
                return "BOGA BURCU";
            }
        }
        else if(ay == 5){
            if(onceMiSonraMi(gun)){
                return "BOGA BURCU";
            }else{
                return "IKIZLER BURCU";
            }
        }
        else if(ay == 6){
            if(onceMiSonraMi(gun)){
                return "IKIZLER BURCU";
            }else{
                return "YENGEC BURCU";
            }
        }
        else if(ay == 7){
            if(onceMiSonraMi(gun)){
                return "YENGEC BURCU";
            }else{
                return "ASLAN BURCU";
            }
        }
        else if(ay == 8){
            if(onceMiSonraMi(gun)){
                return "ASLAN BURCU";
            }else{
                return "BASAK BURCU";
            }
        }
        else if(ay == 9){
            if(onceMiSonraMi(gun)){
                return "BASAK BURCU";
            }else{
                return "TERAZI BURCU";
            }
        }
        else if(ay == 10){
            if(onceMiSonraMi(gun)){
                return "TERAZI BURCU";
            }else{
                return "AKREP BURCU";
            }
        }
        else if(ay == 11){
            if(onceMiSonraMi(gun)){
                return "AKREP BURCU";
            }else{
                return "YAY BURCU";
            }
        }
        else if(ay == 12){
            if(onceMiSonraMi(gun)){
                return "YAY BURCU";
            }else{
                return "OGLAK BURCU";
            }
        }else {
            //default
            return "OGLAK BURCU";
        }
    }

    private static boolean onceMiSonraMi(int gun){
       return gun < 23;
    }
}


