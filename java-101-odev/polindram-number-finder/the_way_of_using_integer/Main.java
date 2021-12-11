package com.huseyinuslu.java101;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Polinant number scanner
     * @Author Huseyin Uslu
     * @Since 11.12.2021
     */

    public static void main(String[] args) {

        System.out.println("Polinant number finder...");
        System.out.print("Please type a number: ");

      boolean polinantSayi = isPolinantSayi(new Scanner(System.in).nextInt());

      if (polinantSayi) System.out.println("The number is polinant.");
      else System.out.println("The number isn't polinant.");

    }

    public static boolean isPolinantSayi(int number) {
        int numberOfDigits = String.valueOf(number).length();
        int reversedNumber = 0,digitController = 1,originalNumber = number;

        while(String.valueOf(digitController).length() != numberOfDigits){
         digitController *= 10;
        }

        while(digitController != 0){
            reversedNumber += (number % 10) * digitController;
            number = (number - (number % 10)) / 10;
            digitController /= 10;
        }

        return reversedNumber == originalNumber;
    }
}




