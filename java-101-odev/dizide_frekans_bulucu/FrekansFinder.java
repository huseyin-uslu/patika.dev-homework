package com.huseyinuslu.java101.dizide_frekans_bulucu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrekansFinder {

    /**
     * @Name Arraydeki Sayıların Frekanslarını Bulan Yazılım
     * @Author Huseyin Uslu
     * @Since 28.12.2021 - Tuesday
     */


    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 2, 2, 2, 2, 3, 3, 5, 5, 6, 6, 6};
        System.out.println("\n" + "Liste: " + Arrays.toString(numbers) + "\n");
        numbersFrakansListener(numbers);

    }

    private static void numbersFrakansListener(int[] array){

        int numberOfNumbers = 0;

        List<Integer> usedNumbers = new ArrayList<Integer>();

        for(int numFirst : array){
            if(isNumberUsed(numFirst,usedNumbers))
                continue;
            for(int numSecond : array){
                if(numSecond == numFirst)
                numberOfNumbers++;
            }

            System.out.println(""
                    + numFirst + " sayısı " + numberOfNumbers + " kez kullanılmıştır.");
            usedNumbers.add(numFirst);
            numberOfNumbers = 0;
        }
    }

    private static boolean isNumberUsed(int num,List<Integer> array){
        for(int ar : array){
            if(num == ar)
                return true;
        }
        return false;
    }

}
