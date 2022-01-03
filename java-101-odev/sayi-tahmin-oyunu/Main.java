package com.huseyinuslu.java101;


import java.util.*;


public class Main {

    private static int randomNumber(int from,int until){
        int num = (int) Math.round((double) Math.random() * (double) until);
        while(num < from){
            num = (int) Math.round((double) Math.random() * (double) until);
        }
        return num;
    }
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Computer kept a number. If you find out, you get a score.");
    int score = 0,yourNum = input.nextInt(),compNum = randomNumber(randomNumber(1,50),100);
    while(yourNum>0 && yourNum <= 100){
        if(yourNum == compNum){
            score += 5;
            System.out.println("score: "+ score);
            System.out.println("bildin. -> " + compNum + "\n" + "seninki:" + yourNum + "\n" + "bilgisayarınki: " + compNum);
        }else{
            System.out.println("bilemedin. -> " + compNum);
            System.out.println("score: " + score);
        }
        compNum = randomNumber(randomNumber(1,50),100);
        yourNum = input.nextInt();
    }
    input.close();
    System.out.println("total score: " + score);
}

}