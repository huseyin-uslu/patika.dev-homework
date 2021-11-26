package com.huseyinuslu.java101;


import java.util.Scanner;

public class Main {
    /**
     * üslü sayı hesaplayan yazılım..
     * @Author Huseyin Uslu
     * @Since 26.11.2021
     */

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       int number,power,result;

       while(true){
           System.out.print("please type a number: ");
           number = input.nextInt();
           System.out.print("please a power value of the number you typed in: ");
           power = input.nextInt();
           try{
               result = usluSayiAl(number,power);
               break;
           }catch (NumberFormatException e){
               System.out.println(e.getMessage());
               System.out.println("enter a number again.");
           }
       }

       System.out.println("sonuc: " + result);

   }

   private static int usluSayiAl(int number,int power) throws NumberFormatException{
       if(number == 0){
           if(power == 0) throw new NumberFormatException("sıfır üssü sıfır belirsizdir.");
           if(power > 0){
               return 0;
           }else{
               throw new NumberFormatException("negatif üslüden tam sayi cikmaz.");
           }

       }else{
           if (power == 0) return 1;
           if(power > 0) {
               int x = number;
               for(int i = 0;i<power;i++){
                   x *= x;
                   return x;
               }
           }else{
               throw new NumberFormatException("negatif üslüden tam sayi cikmaz.");
           }
       }
  throw new NumberFormatException("there is an issue!!"); }
}



