package com.huseyinuslu.java101.harmonik_ortalama;

import java.util.Scanner;

public class HarmonicMeanCalculater {

    /**
     * @Name Array'den Harmonik Ortalama Hesaplayan Yazılım
     * @Author Huseyin Uslu
     * @Since 24.12.2021 - Friday
    */

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayinin harmonik ortalaması için bir sayi giriniz: ");
        System.out.println("Harmonik ortalama değeri: " + getHarmonicMean(input.nextInt()));
    }

    private static double getHarmonicMean(int n){
        double sum = 0.0;
        double[] array = getHarmonicArray(n);
        for(double item : array){
           sum += item;
        }
        return array.length / sum;
    }

    private static double[] getHarmonicArray(int n){
        // 1 + 1/2 + 1/3 + 1/4.... =?
        double[] harmonicArray = new double[n];
        for(int i = 0;i<harmonicArray.length;i++){
            harmonicArray[i] = 1.0 / (i + 1);
        }
        return harmonicArray;
    }

}




