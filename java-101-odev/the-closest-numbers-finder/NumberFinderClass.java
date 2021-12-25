package com.huseyinuslu.java101.yakin_sayi_bulucu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberFinderClass {

    /**
     * @Name En Yakın Büyük ve Küçük Sayıyı Bulan Yazılım
     * @Author Huseyin Uslu
     * @Since 25.12.2021 - Friday
    */

    public static void main(String[] args){
        /*
       - The machine prepares the array and the numbers in the array to be used
       after that user types a number and after typing, user will see the closest bigger number
       and the closest smaller number than the one the user would type.
        */

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number;
        int[] array = new int[random.nextInt(10,20)];

        for(int i = 0;i<array.length;i++){
            array[i] = random.nextInt(-9999,9999);
        }

        //communicate with user
        System.out.println("Liste: " + Arrays.toString(array));
        System.out.print("Bir sayi giriniz: ");

        //print
        number = input.nextInt();
        printNumbersClosest(array,number);
    }

    //The function that prints the numbers which are the goal of that program.
    private static void printNumbersClosest(int[] array,int number){

        //get the numbers from the methods ,which have the missions.
        int theBiggest = getBigNumberClosest(array,number);
        int theSmallest = getSmallNumberClosest(array,number);

        System.out.println("" +
                (theBiggest == number ? "Daha büyük bir sayı yoktur." : "En yakın büyük sayı: " + theBiggest +
                        "\n" +(
                        theSmallest == number ? "Daha küçük bir sayı yoktur." : "En yakın küçük sayı: " + theSmallest)));
    }

    //the first approach that finds the number we look for
    private static int getBigNumberClosest(int[] array,int number) {
        int[] difference = new int[array.length];
        int theBiggestDifference = number;

        for (int i = 0; i < array.length; i++) {
            difference[i] = array[i] - number;
        }

        for (int dif : difference) {
            if (dif > 0) {
                theBiggestDifference = theBiggestDifference < dif ? theBiggestDifference : dif;
            }
        }
        return theBiggestDifference + number;
    }

    //the second approach that finds the number we look for
    private static int getSmallNumberClosest(int[] array,int number){
        int theSmallestNumber = number;

       Arrays.sort(array);
       for(int aR : array){
           if(aR>number)
               return theSmallestNumber;
           theSmallestNumber = aR;
       }
       return theSmallestNumber;
    }
}




