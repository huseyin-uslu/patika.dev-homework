package com.huseyinuslu.java101;


import java.util.Scanner;

public class Main {
    /**
     * Ters Yildiz Yapan Yazilim
     * @Author Huseyin Uslu
     * @Since 06.12.2021
     */

    public static void main(String[] args) {
        System.out.print("Yildiz sayisini girin lütfen: ");
        int number = new Scanner(System.in).nextInt();
        int line = -1;
        if(number % 2 == 0)
            number++;
        while(number >= 1){
            line++;
            System.out.println(lineCreater(number,line));
            number--;
            number--;
        }
    }

    private static String lineCreater(int starCount,int line){
        StringBuilder builder = new StringBuilder();
        for (int i = 0;i<line;i++){
            builder.append(" ");
        }
       for(int i = 0; i<starCount;i++){
           builder.append("*");
       }
        for (int i = 0;i<line;i++){
            builder.append(" ");
        }
        return builder.toString();
    }
}


