package com.huseyinuslu.java101.ebob_ekok_project;
import java.util.Scanner;

public class Main {
    /**
     * EBOB & EKOK projesi.
     * @Author Huseyin Uslu
     * @Since 02.12.2021
     */

//    EKOK = (n1*n2) / EBOB
//    EKOK / EBOB = (n1*n2)
//    EBOB = (n1*n2) / EKOK

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int EBOB = 1,EKOK = 1,firstNumber,secondNumber,divider = 2;
        System.out.println("for the values of EBOB & EKOK please type in two numbers. \n");
        System.out.print("first number: ");
        firstNumber = input.nextInt();
        System.out.print("second number: ");
        secondNumber = input.nextInt();

        do{
          if(firstNumber % divider == 0 || secondNumber % divider == 0){
              if(firstNumber % divider == 0 && secondNumber % divider == 0){
                  EBOB = divider * EBOB;
                  EKOK = divider * EKOK;
                  firstNumber = firstNumber / divider;
                  secondNumber = secondNumber / divider;
              }else{
                  if(firstNumber % divider == 0){
                      EKOK = divider * EKOK;
                      firstNumber = firstNumber / divider;
                  }else{
                      EKOK = divider * EKOK;
                      secondNumber = secondNumber / divider;
                  }
              }
           }else{
                divider++;
            }
        }while (divider <= firstNumber || divider <= secondNumber);

        System.out.println("EBOB: " + EBOB + "\n" + "EKOK: " + EKOK + "\n");

    }
}
