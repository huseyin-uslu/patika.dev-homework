package com.huseyinuslu.java101.model;

import com.huseyinuslu.java101.Main;

import java.util.ArrayList;
import java.util.Objects;

public class AllUserRegs extends ArrayList<Identification> {
    //please create a method here to create a new user registiration.

    public void createNewUser(Identification identity) throws Exception{
        for(Identification id : this){
            if(idConfirmation(id,identity))
                continue;
            throw new Exception("" + identity.getUserName() + " boyle bir kullanici adi mevcut.");
        }
        add(identity);
        System.out.println("Kullanici basariyla olusturulmustur.");

        Main.currentIdentity = identity;
        Main.welcomeScreenControl++;
        Main.main(null);
    }

    private boolean idConfirmation(Identification idfirst,Identification idSecond){
        return !idfirst.getUserName().equals(idSecond.getUserName());
    }

    public Identification getUserByNameAndPassword(String username,String password) throws Exception {
        for(Identification id : this){
           if(id.getUserName().equals(username) && id.passwordConfirmation(password)){
               return id;
           }
        }
        throw new Exception("There is no one named " + username);
    }
}
