package com.huseyinuslu.java101.model;

public class Identification {

   final private String realName;
         private String userName;
         private String password;
         private double savedMoney;

    public Identification(
            String realName,
            String userName,
            String password,
            double savedMoney){

        this.realName = realName;
        this.userName = userName;
        this.password = password;
        this.savedMoney = savedMoney;
    }

    public void withDrawnMoney(double amount) throws Exception{
        if(amount <= savedMoney){
            //approveTheWithDrawnMoney
            savedMoney -= amount;
            System.out.println("" + amount + " TL para hesabınızdan çekilmiştir.");
        }else{
            System.out.println("yetersiz bakiye.");
            throw new Exception("yetersiz bakiye. Lutfen farkli bir deger giriniz.");
        }
    }

    public void saveMoney(double amount){
        savedMoney += amount;
        System.out.println("Sisteme " + amount + " TL paranız yatırılmıştır.");
    }

    public boolean changePassword(String oldPassword,String newPassword,String newPasswordAgain) throws Exception {
        if(oldPassword.equals(password)){
            if(newPassword.equals(newPasswordAgain)){
                this.password = newPassword;
                return true;}
            throw new Exception("Yeni şifrenizi onaylarken şifreler eşleşmediğini farkettik. Lütfen tekrar deneyiniz.");
        }else {
            //typed in wrong
            throw new Exception("Eski sifrenizi yanlis girdiniz. Lutfen tekrar deneyiniz.");
        }
    }

    public void changeUsername(String password,String newName) throws Exception {
        if(this.password.equals(password)){
            System.out.println("" + userName + " kullanici adiniz " + newName + " olarak degistirildi.");
            userName = newName;
        }else{
            throw new Exception("Sifrenizi yanlis girdiginiz icin isminizi degistiremiyoruz. Tekrar deneyiniz.");
        }
    }

    public boolean passwordConfirmation(String password){
        return this.password.equals(password);
    }
    public double getSavedMoney() {
        return savedMoney;
    }

    public String getRealName() {
        return realName;
    }

    public String getUserName() {
        return userName;
    }

}
