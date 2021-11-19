package com.huseyinuslu.java101.model;

import com.huseyinuslu.java101.util.YolculukTip;

public class UserInformation {

    private final String name;
    private final String surname;
    private final YolculukTip tip;
    private final int yas;
    private final int km;
    private double tTUTAR = 0.0;

    private final double YOLCULUK_KM_TARIFESI = 0.10;

    public UserInformation (
            String name,
            String surname,
            YolculukTip tip,
            Integer yas,
            Integer km){

        this.name = name;
        this.surname = surname;
        this.tip = tip;
        this.yas = yas;
        this.km = km;

        tutariHesapla();
    }

    public String getName() {
        return name + " " + surname;
    }

    public YolculukTip getTip() {
        return tip;
    }

    public int getYas() {
        return yas;
    }

    public int getKm() {
        return km;
    }

    public String getTutar(){
        return "" + (int) tTUTAR + " TL";
    }

    private void tutariHesapla(){
        tTUTAR = YOLCULUK_KM_TARIFESI * km;
        if(tip == YolculukTip.GIDIS_GELIS){
            tTUTAR = tTUTAR * 2 * 0.80; // %20 indirim gidis-donus
        }
        yasIndirimi();
    }

    private void yasIndirimi(){
        if(yas < 12){
            tTUTAR = tTUTAR * 0.50; // %50 indirim çocuklar için
        }else if(yas >= 12 && yas <= 24){
            tTUTAR = tTUTAR * 0.90; // %10 indirim öğrenciler için
        }else if(yas >= 65){
            tTUTAR = tTUTAR * 0.70; // %30 indirim yaşlılar için
        }
    }

}
