package com.huseyinuslu.java101.us_hesabi_yapan;

import java.util.Scanner;

public class UsHesabiYapanClass {

    /**
     * Us hesabi yapan yazilim
     * @Author Huseyin Uslu
     * @Since 13.12.2021
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result,taban,us;
        do{
            System.out.print("tabani giriniz: ");
            taban = scan.nextInt();
            System.out.print("ussu giriniz: ");
            us = scan.nextInt();
            result = power(taban,us);
            if(result != 0)
                System.out.println("result: " + result);
        }while (result != 0);
    }

    private static int power(int number,int powered){
        if(number <= 0){
            System.out.println("Lütfen 0 ve üzeri bir degerin üssünü almaya calisiniz.");
        return 0;}

        if(powered == 1)
            return number;

        return power(number,powered - 1) * number;
    }
}




