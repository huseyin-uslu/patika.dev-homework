package com.huseyinuslu.java101;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Fibonacci calculater
     * @Author Huseyin Uslu
     * @Since 07.12.2021
     */

    public static void main(String[] args) {
        fibonacci(100);
    }

    private static void fibonacci(int a){
       int x = 0,y = 1,z = 0;

       while(z < a) {
           System.out.println("" + x + "+" + y + "= " + (x + y));
           z = x + y;
           x = y;
           y = z;
       }
    }

}


