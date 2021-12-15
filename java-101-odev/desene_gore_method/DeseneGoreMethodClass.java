package com.huseyinuslu.java101.desene_gore_method;


public class DeseneGoreMethodClass {

    /**
     * Desene Gore Method Yazan Yazilim
     * @Author Huseyin Uslu
     * @Since 13.12.2021
     */

    public static void main(String[] args) {
        runThePattern(156);
    }

    private static void runThePattern(int number){
        System.out.print("" + number + " ");
       int result = thePattern(number - 5,number,true);
       if(result == 0)
           System.out.println("finish.");
    }

   private static int thePattern(int number,int origin,boolean isNegative){
        //30 , 25 , 20 , 15 , 10, 5 , 0 , 5 , 10 , 15 , 20 , 25 , 30...//
       if(number > origin && !isNegative)
           return 0;
       if(number <= 0)
           isNegative = false;
       System.out.print("" + number + " ");
       return isNegative ? thePattern(number-5,origin,true) : thePattern(number +5,origin,false);
   }
}




