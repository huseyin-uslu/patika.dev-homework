package com.huseyinuslu.java101;

import com.huseyinuslu.java101.model.UserInformation;
import com.huseyinuslu.java101.util.YolculukTip;

import java.util.*;

public class Main {
    /**
     * Ucak Bileti Fiyati Hesaplayan Yazilim
     * @Author Huseyin Uslu
     * @Since 19.11.2021
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputKM,yas;
        String name,surname;
        YolculukTip tip;

        System.out.println("Ucak Bileti Tutar Hesaplama Yazılımına Hoşgeldiniz.");
        System.out.print("Isminiz nedir: ");
        name = input.next();
        System.out.print("Soyadiniz nedir: ");
        surname = input.next();
        System.out.print("Kac yasinizdasiniz: ");
        yas = adjustTheCorrectValue(110);
        System.out.print("Sadece gidis bileti için: 1 \n Gidis-Donus bileti için: 2 \n tıklayınız...:: ");
        switch (adjustTheCorrectValue(2)) {
            default -> tip = YolculukTip.TEK_GIDIS;
            case 1 -> tip = YolculukTip.GIDIS_GELIS;
        }
        System.out.print("Kilometreyi giriniz: ");
        inputKM = adjustTheCorrectValue(9999999);

        UserInformation info = new UserInformation(name,surname,tip,yas,inputKM);
        System.out.println(info.getName() + " bey" + " bilet tutariniz: " + info.getTutar());
    }

    private static int adjustTheCorrectValue(int choiceAmount){
        int value = new Scanner(System.in).nextInt();
        if(!(choiceAmount >= 1 && value <= choiceAmount)){
            System.out.println("Hatali bir deger girdiniz. Tekrar deneyiniz.");
           return adjustTheCorrectValue(choiceAmount);
        }else{
            return value;
        }
    }
}


