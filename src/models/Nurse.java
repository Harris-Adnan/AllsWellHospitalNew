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
public class Nurse extends User{
    
    private String nurseId;
    
    //Getters
    public String getNurseId(){
        
        return nurseId;
        
    }
    
    //Setters
    
    public void  setNurseId(String nurseIdIn) {
        
        nurseId = nurseIdIn;
    }
    
     //0 param constructor
    public Nurse() {
        //user
        super();
        nurseId = "";
    }
    
     //fully loaded constructor
    public Nurse(String usernameIn, String passwordIn, String firstnameIn, String lastnameIn, String addressIn, String postCodeIn, String nurseIdIn) {
        
        //user class over loaded
        super(usernameIn, passwordIn, firstnameIn, lastnameIn, addressIn, postCodeIn);
        
        nurseId = nurseIdIn;
    }

}
