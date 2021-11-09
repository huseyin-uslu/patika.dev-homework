package com.huseyinuslu.java101;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        islem();
    }

    private static void islem(){
        Scanner input = new Scanner(System.in);
        int birinci,ikinci;
        double sonuc = 0.0;

        try{
            System.out.print("birinci sayiyi giriniz: ");
            birinci = input.nextInt();

            System.out.print("ikinci sayiyi giriniz: ");
           ikinci = input.nextInt();

           System.out.println("\n +: 1 \n -: 2 \n *: 3 \n /: 4");
            byte operator = input.nextByte();
           if (operator < 1 || operator > 4){
               throw new java.util.InputMismatchException();
           }else {

               switch (operator){
                   case 1:
                       sonuc = birinci + ikinci;
                       break;
                   case 2:
                       sonuc = birinci - ikinci;
                       break;
                   case 3:
                       sonuc = birinci * ikinci;
                       break;
                   case 4:
                       sonuc = birinci / ikinci;
                       break;
                   default:
                       islem();
                       break;
               }
               System.out.println("sonucunuz: " + sonuc);
           }

        }catch (java.util.InputMismatchException e){
            System.out.println("lutfen kurallara uygun bir deger giriniz.");
            islem();
        }
    }
}
