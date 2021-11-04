package com.huseyinuslu.interestcalculater;

import java.util.Scanner;

/**
 * @author Huseyin Uslu
 * @version 1.0
 * @since 3.11.2021
 * Daire diliminin alanını bulan yazilim */

public class Main {

    private static final double PI_VALUE = 3.14;
    //formül: (𝜋 * (r*r) * 𝛼) / 360

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        print("Yarıçapı r, merkez açısının ölçüsü \uD835\uDEFC olan daire " +
                "diliminin alanı bulan programı yazınız.\n\n",true);

       print("Merkez acinin olcusunu giriniz: ",false);
       double merkezAci = input.nextInt(),sonuc = 0,yariCap;

       print("Yari capinin olcusunu giriniz: ",false);
       yariCap = input.nextInt();

       sonuc = (PI_VALUE * (yariCap * yariCap) * merkezAci) / 360;
       print("sonuc: " + sonuc,false);

    }

    private static void print(String str,boolean hasLine){
        if(hasLine){
            System.out.println(str);
        }else{
            System.out.print(str);
        }
    }
    }

