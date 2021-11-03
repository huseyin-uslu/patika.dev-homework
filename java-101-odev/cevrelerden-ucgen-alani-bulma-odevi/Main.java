package com.huseyinuslu.interestcalculater;

import java.util.Scanner;

/**
 * @author Huseyin Uslu
 * @version 1.0
 * @since 3.11.2021
 * Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,u,alan;

        System.out.println("_ Kenar degerlerinden ucenin alanini hesaplayan program _ \n \n");

        System.out.print("1.kenari giriniz: ");
        a = input.nextInt();
        System.out.print("2.kenari giriniz: ");
        b = input.nextInt();
        System.out.print("3.kenari giriniz: ");
        c= input.nextInt();

        //2u = ucgen alani
        u = (a + b + c) / 2;
        alan = u * (u-a) * (u-b) * (u-c);

        System.out.println("Ucgenin alani = " + alan);


    }

}
