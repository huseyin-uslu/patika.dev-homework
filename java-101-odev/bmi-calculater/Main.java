package com.huseyinuslu.interestcalculater;

import java.util.Scanner;

/**
 * @author Huseyin Uslu
 * @version 1.0
 * @since 3.11.2021
 * Vucut boy kilo endexi olcumleyici */

public class Main {

    //formul: Kilo (kg) / Boy(m) * Boy(m)

    private static final String ERROR = "Belli degerlerin disina cikamazsiniz. Mumkün degerler: ";

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] values = new double[]{0.0,0.0,0.0};

        String[] requests = new String[]{
                "Kilonuzu giriniz: ",
                "Boyunuzu giriniz(metre cinsinden): ",
                "Yasinizi giriniz: "};

        for(int i = 0; i<requests.length; i++){
            print(requests[i],false);
            values[i] = input.nextDouble();
        }

        int kilo = (int) values[0],yas = (int) values[2];
        double boy = values[1];
        double sonuc = kilo / (boy * boy);

        print("Vucut kitle endeksiniz: " + sonuc,false);
    }

    private static void print(String str,boolean hasLine){
        if(hasLine){
            System.out.println(str);
        }else{
            System.out.print(str);
        }
    }

    }

