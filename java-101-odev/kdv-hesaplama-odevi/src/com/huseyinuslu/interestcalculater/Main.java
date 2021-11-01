package com.huseyinuslu.interestcalculater;
import java.util.Scanner;

public class Main {

    //input method disinda tanimlanmistir.
    public static Scanner input;

    //tekrar eden veriler const deger olarak ayarlandi.

    public static final int KDV_VALUE_A = 118; //%18
    public static final int KDV_VALUE_B = 108; //%8

    public static final String ERROR_MESSAGE = "Lutfen duzgun bir deger giriniz: ";
    public static final String INPUT_VALUE_MESSAGE = "Lütfen paranizin degerini giriniz: ";

    public static void main(String[] args) {
        definition();

	//KDV tutari = %18 or %8

        printLiner(INPUT_VALUE_MESSAGE,false); //kendi printer'im

        double value = proceed(); //kullanici para degeri mi girdi yoksa dalga mi geciyor?
        double interested_value =  interestCalculater(value); //kdv orani hesaplayici

        int kdvValue = (value > 1000 ? KDV_VALUE_A : KDV_VALUE_B) - 100; //saf kdv orani

        //sonuc :
        printLiner("\n" + "Para: " + value + "\n" + "KDV orani: " +  kdvValue + "\n" + "KDV'li para: " + interested_value + "\n",true);
    }

    private static void definition(){ //tanimlamalari yapacagimiz yer
        input = new Scanner(System.in);
    }

    private static double proceed(){ //sürec
        int value;

        try{

             value = Integer.parseInt(input.nextLine());

        }catch (NumberFormatException e){

            printLiner(ERROR_MESSAGE,false);

           return  proceed();
        }

        return value;
    }


    private static double interestCalculater(double value){ //hesaplayici

        if(value >= 1000){

            return (double) (KDV_VALUE_B / 100.0) * value;

        }else if(0 < value){

            return (double) (KDV_VALUE_A / 100.0) * value;

        }else{

            printLiner(ERROR_MESSAGE,false);
            return interestCalculater(input.nextInt());

        }
    }

    private static void printLiner(String msg,boolean isThereLine){ //printer'im

        if (isThereLine) {

            System.out.println(msg);

        } else {

            System.out.print(msg);

        }
    }
}
