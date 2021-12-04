package com.huseyinuslu.java101;

import com.huseyinuslu.java101.model.AllUserRegs;
import com.huseyinuslu.java101.model.Identification;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * ATM projesi.
     * @Author Huseyin Uslu
     * @Since 02.12.2021
     */

    private static AllUserRegs userControlSystem = new AllUserRegs();
    public static int welcomeScreenControl = 0;
    public static Identification currentIdentity = null;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        if(welcomeScreenControl == 0) {
            System.out.println("Huseyin Uslu bankasina hosgeldiniz.");

            optionSet(new String[]{"create a new user","sign in","exit"});

            switch(chooseOption(3,input.nextInt())){
                case 0:
                    createNewUser();
                    break;
                case 1:
                    signIn();
                    break;
                case 2:
                    exit();
                    break;
            }

        }else{
            System.out.println("Welcome to Main Menu \n");
            System.out.println("current user: " + currentIdentity.getUserName());
            System.out.println("current money: " + currentIdentity.getSavedMoney());
            System.out.println("username: " + currentIdentity.getUserName());

            optionSet(new String[]{"withdrawn money","save money","sign out","exit"});

            switch(chooseOption(4,new Scanner(System.in).nextInt())){
                case 0:
                    withdrawnMoney();
                    break;
                case 1:
                    saveMoney();
                    break;
                case 2:
                    signOut();
                    break;
                case 3:
                    exit();
                    break;
            }
            main(null);
        }


    }

    private static void createNewUser(){
        Scanner input = new Scanner(System.in);
        String realName,userName,password;
        double money;

        System.out.print("What is your real name: ");
        realName = input.nextLine();
        System.out.print("What is your user name: ");
        userName = input.nextLine();
        System.out.print("What is your password: ");
        password = input.nextLine();
        System.out.print("How much do you want to put your money into the your bank account: ");
        money = input.nextInt();

        Identification identity = new Identification(realName,userName,password,money);
        System.out.println(identity.getRealName() + ", will we create your account?");

        optionSet(new String[]{"Yes -> true","No -> false"});
        if(input.nextBoolean()){
            try {
                userControlSystem.createNewUser(identity);
            }catch (Exception e){
                optionSet(new String[]{"What is your real name agan: ","What is your user name: "});
                identity = new Identification(input.next(),input.next(),password,money);

                System.out.println(identity.getRealName() + ", will we create your account?");
                optionSet(new String[]{"Yes -> true","No -> false"});
                if(input.nextBoolean()) {
                    try {
                        userControlSystem.createNewUser(identity);
                        welcomeScreenControl = 1;
                        currentIdentity = identity;
                        main(null);
                    } catch (Exception error) {
                        System.out.println("Dalga gecmiyorsaniz yeniden profil olusturun.");
                        createNewUser();
                    }
                }
            }
        }else{
            System.out.println("Tamam o zaman main menu'ye yonlendiriliyorsunuz.");
            currentIdentity = null;
            welcomeScreenControl = 0;
            main(null);
        }
        input.close();
    }

    private static void signIn() {
        System.out.println("Giris ekranina hosgeldiniz.");
        System.out.print("username: ");
        String usern = new Scanner(System.in).next(),password;
        System.out.print("password: ");
        password = new Scanner(System.in).next();
        try{
            currentIdentity = userControlSystem.getUserByNameAndPassword(usern,password);
            welcomeScreenControl++;
            main(null);
        }catch (Exception e){
            System.out.print(e.getMessage());
            System.out.println("Lutfen girisi tekrar deneyiniz.");
        }

    }

    private static void withdrawnMoney(){
        System.out.println("Para çekme ekranına hoşgeldiniz.");
        System.out.println("Para miktari: " + currentIdentity.getSavedMoney() + " TL");
        System.out.print("Ne kadar para çekmek istersiniz: ");
        double theMoneyToBeWithdrawn = new Scanner(System.in).nextDouble();
        try{
            currentIdentity.withDrawnMoney(theMoneyToBeWithdrawn);
        }catch (Exception e){
            System.out.println(e.getMessage());
            withdrawnMoney();
        }

    }

    private static void saveMoney(){
        System.out.println("Para yatirma ekranina hosgeldiniz.");
        System.out.print("Ne kadar para yatiracaksiniz: ");
        double amountOfMoneyToBeDeposited = new Scanner(System.in).nextDouble();
        currentIdentity.saveMoney(amountOfMoneyToBeDeposited);
        System.out.println("Sisteme " + amountOfMoneyToBeDeposited + " kadar para yatirilmistir.");
        main(null);
    }

    private static void signOut(){
        System.out.println("" + currentIdentity.getRealName() + " basariyla cikis yaptiniz. Gene bekleriz.");
        currentIdentity = null;
        welcomeScreenControl = 0;
        main(null);
    }

    private static void exit(){
        if(currentIdentity != null){
            System.out.println(currentIdentity.getRealName() + " beyefendi görüşürüz. İyi günler dileriz.");
        }else{
            System.out.println("İyi günler dileriz.");
        }
    }

    private static int chooseOption(int optionsCount,int whichOneChoosen) {
    if(optionsCount > whichOneChoosen && 0 >= whichOneChoosen){
        return whichOneChoosen;
    }else {
        System.out.print("Secilen seçenek gecerli aralikta degildir.Lutfen tekrar giriniz: ");
        return chooseOption(optionsCount,new Scanner(System.in).nextInt());
    }
    }

    private static void optionSet(String[] optionArgs){
        List<String> list = Arrays.asList(optionArgs);
        StringBuilder text = new StringBuilder();
        int pagination = 0;
        for(String inf : list){
            text.append("").append(pagination).append("-").append(inf).append("\n");
            pagination++;
        }
        System.out.println(text + "\n");
        System.out.print("your option: ");
    }
}


