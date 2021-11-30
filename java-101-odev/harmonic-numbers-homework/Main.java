package com.huseyinuslu.java101;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Harmonik seri bulan yazilim.
     *
     * @Author Huseyin Uslu
     * @Since 30.11.2021
     */

    public static void main(String[] args) {

              /* harmonic numbers starts with 1 and continues with 1/2 + 1/3 + 1/4 + 1/n */

        Scanner input = new Scanner(System.in);
        int whichNumber = input.nextInt();
        System.out.println("result: " + getHarmonicConsuquence(whichNumber));
    }

    private static double getHarmonicConsuquence(int number) {
        double result = 0;
        for(int i = 1;i<=number;i++){
            result += (1.0 / i);
        }
        return result;
    }


}


