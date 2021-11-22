package com.huseyinuslu.java101;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Artık Yıl Hesaplayan Yazılım
     * @Author Huseyin Uslu
     * @Since 22.11.2021
     */

    public static void main(String[] args)  {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir yıl giriniz: ");

    try{

        yil = input.nextInt();

        if(yil % 4 == 0){
            System.out.println("" + yil + " artik bir yildir.");
        }else{
            System.out.println("" + yil + " artik bir yil degildir.");
        }

    }catch (java.util.InputMismatchException e){
        System.out.println("hatali bir deger girdiniz.");
    }
        input.close();
    }



}


