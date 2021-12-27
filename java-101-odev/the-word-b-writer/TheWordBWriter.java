package com.huseyinuslu.java101.the_word_b_writer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TheWordBWriter {

    /**
     * @Name B harfi yazan yazılım
     * @Author Huseyin Uslu
     * @Since 27.12.2021 - Monday
    */

    public static void main(String[] args){

        String[][] letter = new String[7][9];
        
        for(int i = 0;i< letter.length;i++){
            if(i % 3 == 0)
          letter[i] = new String[]{"*********"};
                  else
                letter[i] = new String[]{"*       *"};
                  System.out.println("" + Arrays.toString(letter[i]));
        }
    }
}




