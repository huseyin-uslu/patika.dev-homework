package com.huseyinuslu.java101;


import java.util.Scanner;

public class Main {
    /**
     * Girilen sayiya kadar 4 ve 5'in kuvvetlerini ekrana yazdiran yazilim
     * @Author Huseyin Uslu
     * @Since 24.11.2021
     */

   public static void main(String[] args){

       int i = 0;

       Scanner input = new Scanner(System.in);
       System.out.print("bir sayi giriniz: ");
       i = input.nextInt();

       kuvvetiniAl(4,i);
       kuvvetiniAl(5,i);

   }

   private static void kuvvetiniAl (int number, int strength){
      long result = 1L;

       for(int i = 0;i<=strength;i++){
           System.out.println("" + number + "'s " + i + " strength: " + result);
           if(result == 1){
               result = number;
           }else{
               result = result * number;
           }
      }
   }
}



