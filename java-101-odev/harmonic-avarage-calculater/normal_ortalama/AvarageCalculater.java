package com.huseyinuslu.java101.normal_ortalama;

import java.util.Scanner;

public class AvarageCalculater {

    /**
     * @Name Array'den Ortalama Hesaplayan Yazılım
     * @Author Huseyin Uslu
     * @Since 24.12.2021 - Friday
    */

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ne kadar sayı girmek istersiniz: ");

        int[] newArray = new int[input.nextInt()];
        for(int i = 0;i<newArray.length;i++){
            System.out.println("" + (i + 1) + ". item için değer: ");
            newArray[i] = input.nextInt();
        }
        System.out.println("\n" + "ortalama: " + getAvarage(newArray));
    }

    private static double getAvarage(int[] args){
       int avarage = 0;
        for(int num : args){
            avarage += num;
        }
        return (double) avarage / (double) args.length;
    }

}




