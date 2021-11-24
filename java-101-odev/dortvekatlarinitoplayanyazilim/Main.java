package com.huseyinuslu.java101;


import java.util.Scanner;

public class Main {
    /**
     * kullanici tek sayi verene kadar devam eden 4 ve cift katlarini ekrana basan yazilim
     * @Author Huseyin Uslu
     * @Since 24.11.2021
     */

   public static void main(String[] args){

       int i = 0,toplam = 0;
       boolean tekMiCiftMi = true;

       Scanner input = new Scanner(System.in);

       do{
           System.out.print("Yeni bir sayi giriniz: ");
           i = input.nextInt();
           tekMiCiftMi = i%2==0;
           if(!(i%4==0))
               continue;
           toplam = toplam + i;
       }while(tekMiCiftMi);

           System.out.println("hello, tek sayi loop'u bitirdi.");

       System.out.print("4 ve 4'un katlari olan sayilarin toplami: " + toplam);
       input.close();
   }
}



