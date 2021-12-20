package com.huseyinuslu.java101;

import com.huseyinuslu.java101.data.*;



public class Main {

    /**
     * The Fighter Versus Program
     * @Author Huseyin Uslu
     * @Since 20.12.2021
     */

    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
}

}







