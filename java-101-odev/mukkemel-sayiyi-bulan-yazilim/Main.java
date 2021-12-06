package com.huseyinuslu.java101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Mükemmel Sayiyi Kontrol Eden Yazilim
     * @Author Huseyin Uslu
     * @Since 06.12.2021
     */

    public static void main(String[] args) {
        System.out.print("Sayiyi giriniz: ");

        if(checkIfItIsMukkemelSayi(new Scanner(System.in).nextInt())){
            System.out.println("Evet, mükemmel bir sayidir.");
        }else{
            System.out.println("Hayır, mükemmel bir sayi degildir.");
        }

    }

    private static boolean checkIfItIsMukkemelSayi(int number){
        int value = 1;
        List<Integer> dividerIntegers = new ArrayList<Integer>();
        while(value < number){
            if(number % value == 0)
                dividerIntegers.add(value);
            value++;
        }
        value = 0;
        for(int a : dividerIntegers){
            value += a;
        }
        return value == number;
    }
}


