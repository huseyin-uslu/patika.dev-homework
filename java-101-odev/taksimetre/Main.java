package com.huseyinuslu.interestcalculater;

import java.util.Scanner;

/**
 * @author Huseyin Uslu
 * @version 1.0
 * @since 3.11.2021
 * Taksimetre odevi */

public class Main {

    final static double ENTRY_FEE = 10.0;
    final static double MIN_FEE = 20.0;
    final static double KM_PER_FEE = 2.20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km;
        double total;

        System.out.print("km: ");
        km = input.nextInt();

        total =  KM_PER_FEE * km + ENTRY_FEE;
        boolean isLessThanMinFee = (total < MIN_FEE);

        if(isLessThanMinFee){
            total = MIN_FEE;
        }

        String mustAdjustTotal = String.valueOf(total);
        int ch = mustAdjustTotal.indexOf('.') + 2;
        String TOTAL = mustAdjustTotal.substring(0,ch);

        System.out.println("the cost: " + TOTAL + '$');

    }
}
