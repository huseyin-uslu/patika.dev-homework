package com.huseyinuslu.java101;


import java.util.*;


public class Main {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    while(true){
       if(isPolindromic(input.next())){
           System.out.println("polindromik text.");
       }else{
           System.out.println("polindromik değil.");
       }
    }

}

private static String stringReverser(String text){
    String reverse = "";
    for(int i = text.length() - 1;i>=0;i--){
        reverse += text.charAt(i);
    }
    return reverse;
}

private static boolean isPolindromic(String text){
    if(text.equals(stringReverser(text))){
        return true;
    }
    return false;
}

}