package com.huseyinuslu.java101;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * 1-100 Arasi Asal Sayilar Programi
     * @Author Huseyin Uslu
     * @Since 07.12.2021
     */

    public static void main(String[] args) {
        int i = 2;
         while(i> 1 && i<=100){
             if(isPrimeNumber(i))
                 System.out.println("" + i);
             i++;
         }

    }

    private static boolean isPrimeNumber(int number){
        boolean isPrimeNumber = false;
        for(int i = 2;i<number;i++){
          isPrimeNumber = number % i == 0;
          if(isPrimeNumber)
              return false;
        }
        return true;
    }

}


