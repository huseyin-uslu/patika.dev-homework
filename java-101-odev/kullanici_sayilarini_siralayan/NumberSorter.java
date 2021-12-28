package com.huseyinuslu.java101.kullanici_sayilarini_siralayan;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSorter {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç adet numarayı sıralamak istersin: ");
        int wantedNumber = input.nextInt(),typedNumber = 1;
        wantedNumber = wantedNumber <= 0 ? 0 : wantedNumber;

        int[] numbers = new int[wantedNumber];

        while (typedNumber <= wantedNumber){
            System.out.print("" + typedNumber + ".sayi: ");
            numbers[typedNumber - 1] = input.nextInt();
            typedNumber++;
        }

        input.close();

        System.out.println("liste: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted List: " + Arrays.toString(numbers));

    }
}
