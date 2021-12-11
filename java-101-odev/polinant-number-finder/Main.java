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
    String stringNumber = String.valueOf(number);
    StringBuilder reversedStringNumber = new StringBuilder();
    int numberOfDigits = stringNumber.length(),reversedNumber;
    for(int i = numberOfDigits - 1;i>=0;i--){
        reversedStringNumber.append(stringNumber.charAt(i));
    }
    reversedNumber = Integer.parseInt(reversedStringNumber.toString());
    return reversedNumber == number;
    }

}




