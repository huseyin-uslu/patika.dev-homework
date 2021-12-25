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
        //the first and second ways
        printNumbersClosest(array,number);
        //the third way
        theThirdApproach(array,number);
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
       int[] newArray = new int[array.length + 1];

       for(int i = 0;i<array.length;i++){
           newArray[i] = array[i];
       }

       //put our number at the end
       newArray[newArray.length - 1] = number;
       //then sort the array in ascent order.
       Arrays.sort(newArray);

        // if we take our number we query about , it means the index one more time than our number index
        //is the closest bigger number than our number.
       for(int i = 0;i<newArray.length;i++){
           int num = newArray[i];

           if(num == number)
               return newArray[i+1];

       }
       //if number returns, it means there isn't any bigger number than the one user wants.
       return number;
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

    //the 3th way
    private static void theThirdApproach(int[] array,int number){
        int theSmallestNumber = number;
        int theBiggestNumber = number;

        Arrays.sort(array);

        for(int aR : array){
            if(aR>number){
             theBiggestNumber = aR;
             break;
            }
            theSmallestNumber = aR;
        }

        System.out.println(
                "" +
                        "the biggest: " + theBiggestNumber + "\n"
                +"the smallest: " + theSmallestNumber
        );
    }
}




