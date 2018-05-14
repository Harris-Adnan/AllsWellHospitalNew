/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Harris
 */
public class WardSister extends User{
    
    private String wardSisterId;
    
    //Getters
    public String getWardSisterId(){
        
        return wardSisterId;
        
    }
    
    //Setters
    
    public void  setWardSisterId(String wardSisterIdIn) {
        
        wardSisterId = wardSisterIdIn;
    }
    
     //0 param constructor
    public WardSister() {
        //user
        super();
        wardSisterId = "";
    }
    
     //fully loaded constructor
    public WardSister(String usernameIn, String passwordIn, String firstnameIn, String lastnameIn, String addressIn, String postCodeIn,String wardSisterIdIn) {
        
        //user class over loaded
        super(usernameIn, passwordIn, firstnameIn, lastnameIn, addressIn, postCodeIn);
        
        wardSisterId = wardSisterIdIn;
    }
    
}
