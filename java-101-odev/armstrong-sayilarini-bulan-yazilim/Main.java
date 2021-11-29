package com.huseyinuslu.java101;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Armstrong sayilari bulan yazilim.
     *
     * @Author Huseyin Uslu
     * @Since 29.11.2021
     */

    public static void main(String[] args) {
        int number = 0;
        while(number < 99999999){
            number++;
            if(!unknownNumberControl(number))
                continue;
            System.out.println(number);
        }
    }

    private static boolean unknownNumberControl(int number){
        String numberString = (String) String.valueOf(number);
        int order = numberString.length();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> poweredNumbers = new ArrayList<>();

        for(int i = 0;i<order;i++){
            char c = numberString.toCharArray()[i];
            numbers.add(Integer.valueOf(String.valueOf(c)));
        }

        for(int i = 0;i<order;i++){
            poweredNumbers.add(i,sayininUslusunuAl(numbers.get(i),order));
        }

        int toplam = 0;

        for(int num : poweredNumbers){
            toplam += num;
        }

        return toplam == number;
    }

    private static int sayininUslusunuAl(int number,int power){
      int i = 0;
      int num = 1;
      if(power != 0)
        do{
          num *= number;
           i++;
        }while(i<power);
        return num;
    }
}


