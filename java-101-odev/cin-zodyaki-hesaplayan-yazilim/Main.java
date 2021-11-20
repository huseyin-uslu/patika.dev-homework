package com.huseyinuslu.java101;
import java.util.Scanner;

public class Main {
    /**
     * Çin Zodyağı Hesaplayan Yazılım
     * @Author Huseyin Uslu
     * @Since 20.11.2021
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dogum tarihinizi giriniz: ");
        int date = input.nextInt();
        System.out.print("Çin zodyağınız: ");
        System.out.print(getZodyak(date));
    }

    private static String getZodyak(int birthDate){
      int remain = birthDate % 12;
        return switch (remain) {
            case 1 -> "Horoz";
            case 2 -> "Kopek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavsan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Maymun";
        };
    }
}


