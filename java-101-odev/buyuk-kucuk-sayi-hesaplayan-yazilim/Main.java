package com.huseyinuslu.java101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Girilen Sayılarda Min ve Max Sayıyı Bulan Yazılım.
     * @Author Huseyin Uslu
     * @Since 02.12.2021
     */

    public static void main(String[] args) {
        System.out.println("Kaç tane sayi gireceksiniz...");
        List<Integer> numbers = numberCreater(new Scanner(System.in).nextInt());
        System.out.println("en büyük sayi: " + getMaxValue(numbers));
        System.out.println("en kücük sayi: " + getMinValue(numbers));

    }

    private static int getMinValue(List<Integer> integers){
        int smallerNumber = getMaxValue(integers);
        for(int i : integers){
           smallerNumber = smallerNumber < i ? smallerNumber : i;
        }
        return smallerNumber;
    }

    private static int getMaxValue(List<Integer> integers){
        int biggerNumber = 0;
        for(int i : integers){
            biggerNumber = biggerNumber > i ? biggerNumber : i;
        }
        return biggerNumber;
    }

    private static List<Integer> numberCreater(int howManyNumbers){
        List<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 1;i<=howManyNumbers;i++){
            System.out.print("" + i + ".sayiyi giriniz: ");
            arrayList.add(new Scanner(System.in).nextInt());
        }
        return arrayList;
    }
}


