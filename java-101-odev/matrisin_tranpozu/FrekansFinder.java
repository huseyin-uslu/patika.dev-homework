package com.huseyinuslu.java101.matrisin_tranpozu;

import java.util.Arrays;

public class FrekansFinder {

    /**
     * @Name Matrisin Devriğini Ekrana Basan Yazılım
     * @Author Huseyin Uslu
     * @Since 29.12.2021 - Wednesday
     */


    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3,4,5},
                {5,6,7,8,9},
                {9,10,11,12,13},
                {13,14,15,16,17},
                {17,18,19,20,21}};

        System.out.println("Orjinal Matris: ");
        for(int i = 0;i< matris.length;i++){
            System.out.println(Arrays.toString(matris[i]));
        }

        try{
            System.out.println("Changed Matris: ");
            for(int i = 0;i< matris.length;i++){
                System.out.println(Arrays.toString(getTranposedMatris(matris)[i]));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static int[][] getTranposedMatris(int[][] array) throws Exception {

        for(int[] arr : array){
            if(array.length != arr.length){
                throw new Exception("Matris kolon ve sütün eşit sayıda olmalıdır.");
            }
        }

        int[][] newMatris = new int[array.length][array.length];

        for(int i = 0,y= 0;i< array.length;i++){
           while(y<array.length){
              newMatris[i][y] = array[y][i];
              y++;
           }
           y=0;
        }

        return newMatris;
    }
}
