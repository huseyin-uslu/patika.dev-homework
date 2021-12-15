package com.huseyinuslu.java101.asal_sayi_bulan;

import java.util.Scanner;

public class MainAsalSayiBulanClass {

    /**
     * Asal Sayi Bulan Yazilim
     * @Author Huseyin Uslu
     * @Since 13.12.2021
     */

    public static void main(String[] args) {
        System.out.print("please enter a number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println(isPrimeNumber(number,9999) == 0 ? "" + number + " asal sayidir."
                : "" + number + " asal sayi degildir.");
    }

    //TO FIND THE PRIMARY NUMBER , THIS IS THE NORMAL WAY.
    private static boolean isPrimeNumber(int number){
        boolean isDivided = false;
        for(int i = 2;i < number;i++){
            isDivided = (number % i == 0);
            if(isDivided)
                break;
        }
        return !isDivided;
    }

    //RECURSIVE METHOD WHICH IS ABLE TO FIND THE PRIME NUMBER.
    private static int isPrimeNumber(int number,int checkedOutNumber){
       if(checkedOutNumber >= number)
           checkedOutNumber = number - 1;

       if(checkedOutNumber > 1){
           if(number % checkedOutNumber == 0){
               return -1;
           }else{
               return isPrimeNumber(number,checkedOutNumber - 1);
           }
       }else{
           return 0;
       }
    }

}




