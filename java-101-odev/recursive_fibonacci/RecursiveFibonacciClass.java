package com.huseyinuslu.java101.recursive_fibonacci;


import java.util.Scanner;

public class RecursiveFibonacciClass {

    /**
     * Recursive method ile Fibonacci serisi bulan yazilim
     * @Author Huseyin Uslu
     * @Since 13.12.2021
     */

    //1 1 2 3 5 8 13 21 34 55 -> fibonacci

    //f(1) = 1           -> 1.sayi
    //f(2) = 1           -> 2.sayi
    //f(3) = f(2) + f(1) -> 3.sayi
    //f(4) = f(3) + f(2) -> 4.sayi
    //f(5) = f(4) + f(3) -> 5.sayi
    //f(6) = f(5) + f(4) -> 6.sayi

    private static int fib(int orderNumber){
        if(orderNumber == 1 || orderNumber == 2)
            return 1;
        return fib(orderNumber - 1) + fib(orderNumber - 2);
    }

    public static void main(String[] args) {
        System.out.print("Please enter a number on the screen: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Yazilan " + number + ".sıradaki fibonacci serisinde bulanan sayi: " + fib(number));
    }
}




