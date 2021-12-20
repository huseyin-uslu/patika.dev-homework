package com.huseyinuslu.java101;

//IMPORT
import com.huseyinuslu.java101.model.*;


public class Main {

    /**
     * İşçilerin Maaşlarını Hesaplayan Yazılım
     * @Author Huseyin Uslu
     * @Since 20.12.2021
     */

    public static void main(String[] args) {
        Employee hannah = new Employee("Hannah Bagia Dolgie",4000,45,2000);
        Employee murat = new Employee("Kara Murat",1000,45,2015);
        Employee ibrahim = new Employee("İbrahim Can Erdun",999,39,2019);
        Employee burhan = new Employee("Burhan Çaçan",1000,50,2021);
        Employee ahmet = new Employee("Ahmet Akgöz",2000,40,2021);

        hannah.printInfo();
        murat.printInfo();
        ibrahim.printInfo();
        burhan.printInfo();
        ahmet.printInfo();
}

}







