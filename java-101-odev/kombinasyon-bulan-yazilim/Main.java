package com.huseyinuslu.java101;


import java.util.Scanner;

public class Main {
    /**
     * n'in r'li kombinasyonunu hesaplayan yazılım..
     * @Author Huseyin Uslu
     * @Since 24.11.2021
     */

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       System.out.println("n'nin r'li kobinasyonunu yazınız..");
       System.out.print("n= ");

       int n = input.nextInt();
       System.out.print("r= ");

       int r = input.nextInt();

       int kombinasyon = faktoriyelAl(n) / (faktoriyelAl(r) * faktoriyelAl((n - r)));

       System.out.println("kombinasyon= " + kombinasyon);
       //C(n,r) = n! / (r! * (n-r)!) = kombinasyon
   }

   private static int faktoriyelAl(int figure){
       int x = 1;
       int y = 1;

       do{
           System.out.println("" + x + " " + y);
           x = x * (y++);
       }while(y<=figure);
       return x;
   }
}



