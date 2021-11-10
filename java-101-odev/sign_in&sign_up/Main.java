package com.huseyinuslu.java101;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner input;
    private static ArrayList<String> usernames = new ArrayList<>();
    private static ArrayList<String> passwords = new ArrayList<>();

    public static void main(String[] args) {
      welcomeScreen();
    }

    private static void signUP(String username, String password){
        input = new Scanner(System.in);
        try{
            System.out.print("Kullanici adini giriniz: ");
            username = input.next();
            System.out.print("Sifrenizi giriniz: ");
            password = input.next();
            System.out.print("Sifrenizi tekrar giriniz: ");
            String confirmPass = input.next();
            if(confirmPass.equals(password)){
                usernames.add(username);
                passwords.add(password);
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Confirmation went wrongly... Try Again..");
            byte option = checkOptionsFromUser("1- try again \n 2- forgot password please reset it \n 3- sign in",(byte)3);
            switch (option){
                case 1:
                    signUP(username,password);
                    break;
                case 2:
                    resetPassword(username);
                    break;
                case 3:
                    signIN(username,password);
                    break;
                default:
                    welcomeScreen();
                    break;
            }
            signUP(username,password);
        }
        System.out.println("Please sign in " + username);
        signIN(username,password);
    }
   private static void signIN(String username, String password){
       input = new Scanner(System.in);

       try{
           System.out.print("Kullanici adini giriniz: ");
           username = input.next();
           System.out.print("Sifrenizi giriniz: ");
           password = input.next();
           if(!passwords.get(usernames.indexOf(username)).equals(password)){
               throw new Exception();
           }
       }catch (Exception e){
           System.out.println("Neither username nor password is correct!");
           System.out.println("Try again or reset your password");
           byte option = checkOptionsFromUser("1- try again \n 2- forgot password please reset it",(byte)2);
           switch (option){
               case 1:
                   signIN(username,password);
                   break;
               case 2:
                   resetPassword(username);
                   break;
               default:
                   signIN(username,password);
                   break;
           }

           welcomeScreen();
       }
       System.out.println("Sign in is successful.. Welcome " + username);
   }
    private static void resetPassword(String username){
        if(usernames.contains(username)){
            byte index = (byte) usernames.indexOf(username);
            String oldPassword = passwords.get(index);
            System.out.print("Please enter your new password: ");
            String newPassword =  new Scanner(System.in).next();
            if(oldPassword.equals(newPassword)){
                System.out.println("The new password must not be the same as the old password.");
                System.out.println("if you remember your old password , you can sign in or try again..");
                System.out.println();
                byte option = (byte) checkOptionsFromUser("1- try again \n 2- sign in",(byte) 2);
                switch (option){
                    case 1:
                        resetPassword(username);
                        break;
                    case 2:
                        signIN(username,null);
                        break;
                    default:
                        resetPassword(username);
                        break;
                }
            }else{
                passwords.add(index,newPassword);
                System.out.println("Your new password exists now so you can use it.!");
            }
        }else{
            System.out.println("Username cannot be found so that you have to sign up again");
            signIN(username,"");
        }
    }
    private static void welcomeScreen(){
        String username = "",password = "";
        switch (checkOptionsFromUser("1- Sign up \n 2- Sign in", (byte) 2)){
            case 1:
                signUP(username,password);
                break;
            case 2:
                signIN(username,password);
                break;
            default:
                welcomeScreen();
                break;
        }

    }
    private static byte checkOptionsFromUser(String text,byte number){

        byte option = 0;
        input = new Scanner(System.in);

        try{
            System.out.println(text);
            option = input.nextByte();
            if(option > number || option < 1){
                throw new java.util.InputMismatchException();
            }
        }catch (java.util.InputMismatchException e){
            System.out.println("Lutfen gecerli bir deger giriniz.");
            checkOptionsFromUser(text,number);
        }
        return option;
    }
}
