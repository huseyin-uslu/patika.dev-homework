package com.huseyinuslu.java101.tekrar_eden_sayilar_bul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedNumberFinder {

    /**
     * @Name Repeated Number Finder
     * @Author Huseyin Uslu
     * @Since 28.12.2021 - Monday
    */

    public static void main(String[] args) throws Exception {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 2, 2, 2, 2, 3, 3, 5, 5, 6, 6, 6};
        System.out.println(
                "Liste: " +  ((Arrays.toString(numbers)) + "\n " +
                "Tekrar eden sayılar: " +  (Arrays.toString(getRepeatedNumbers(numbers))) + "\n"));

    }

    private static int[] getRepeatedNumbers(int[] array){

        int numberOfNumbers = 0;

      int[] numbers = new int[array.length],repeatedNumbers;

        for(int i = 0;i<array.length;i++){
            int firstItem = array[i];
            if(isNumberInArray(numbers,firstItem) && firstItem != 0)
                continue;
            for(int j = 0;j<array.length;j++){
                if(j == i)
                    continue;
                if(firstItem == array[j]){
                 numbers[numberOfNumbers] = firstItem;
                 numberOfNumbers++;
                 break;
                }
            }
        }

        repeatedNumbers = new int[numberOfNumbers];

        if (numberOfNumbers + 1 >= 0) System.arraycopy(numbers, 0, repeatedNumbers, 0, numberOfNumbers);

        return getRepeatedTotalNumbers(array,repeatedNumbers);
    }

    private static int[] getRepeatedTotalNumbers(int[] allNumbers,int[] repeatedNumbers){
        List<Integer> numbers = new ArrayList<Integer>();

        for(int num : repeatedNumbers){

            for(int repNum : allNumbers){
                if(num == repNum)
                    numbers.add(num);
            }
        }

        int[] numsArray = new int[numbers.size()];
        for(int i = 0;i<numsArray.length;i++){
            numsArray[i] = numbers.get(i);
        }

        return numsArray;
    }

    private static boolean isNumberInArray(int[] array,int num){
        for(int ar : array){
            if(ar == num)
                return true;
        }
        return false;
    }

}




