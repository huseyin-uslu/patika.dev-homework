package com.huseyinuslu.java101;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    private static List<String> lectures(){
       String[] array = new String[]{
               "matematik",
               "turkce",
               "muzik",
               "kimya",
               "fizik"};

       return Arrays.asList(array);
    }

    private static final List<Integer> scores = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lectures = lectures();

        int i = 0;
        //counter for counting all the lessons
    while(i < lectures.size()){
       if(isValid(lectures.get(i))){
           i++;
            }
    }
    double calculation = 0.0;
    int total = 0;
        for(int score : scores){
            total += score;
        }
        calculation = total / (lectures().size());

        if(calculation < 55){
            System.out.println("Unfortunately , you didn't succeed. \n your avarage score : " + calculation);
        }else{
            System.out.println("Conguratilations!!! pass your class. \n with your avarage score :"  + calculation);
        }

    }

    private static boolean isValid(String lecture){
        System.out.println("" + lecture + " dersinden kaç aldın ?" );
        int score = new Scanner(System.in).nextInt();
        if(score >= 0 && score <= 100){
            scores.add(score);
            return true;
        }else {
            System.out.println("Please , enter valid value for the correct calculation.");
            return false;
        }
    }
}
