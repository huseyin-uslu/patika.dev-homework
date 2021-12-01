package com.huseyinuslu.java101;

import java.util.Scanner;

public class Main {
    /**
     * Java Ucgenlerle yildizlardan Dortgen yazilim.
     * @Author Huseyin Uslu
     * @Since 01.12.2021
     */
    private static int totalStars = 0,avarageNumber,floorsCount = 0,whichFloor=1,stars=0;

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter how much there are stars to be made a squre: ");

        totalStars = input.nextInt();
        avarageNumber = totalStars / 2;
        floorsCount = totalStars + 2;

        for(int i = 0;i<avarageNumber-1;i++){
            lineCreater();
            System.out.println(lineCreater());
            Thread.sleep(300);
            whichFloor++;
        }

        for(int i = avarageNumber;i>0;i--){
            System.out.println(lineCreater());
            Thread.sleep(300);
            whichFloor--;
        }



    }

    private static String starPutter(int number,String character){
        StringBuilder newStringBuilder = new StringBuilder();
       if(number>0)
        for(int i = 0;i<number;i++){
            newStringBuilder.append(character);
        }
       return newStringBuilder.toString();
    }

    private static String lineCreater(){
        StringBuilder text = new StringBuilder();
        text.append(starPutter(avarageNumber - whichFloor,"-"));
        text.append(starPutter((whichFloor * 2) - 1,"*"));
        text.append(starPutter(avarageNumber - whichFloor,"-"));
        return text.toString();
    }
}


