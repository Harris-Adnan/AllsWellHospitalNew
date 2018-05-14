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
public class StaffNurse extends User{
    
    private String staffNurseId;
    
    //Getters
    public String getStaffNurseId(){
        
        return staffNurseId;
        
    }
    
    //Setters
    
    public void  setStaffNurseId(String staffNurseIdIn) {
        
        staffNurseId = staffNurseIdIn;
    }
    
     //0 param constructor
    public StaffNurse() {
        //user
        super();
        staffNurseId = "";
    }
    
     //fully loaded constructor
    public StaffNurse(String usernameIn, String passwordIn, String firstnameIn, String lastnameIn, String addressIn, String postCodeIn, String staffNurseIdIn) {
        
        //user class over loaded
        super(usernameIn, passwordIn, firstnameIn, lastnameIn, addressIn, postCodeIn);
        
        staffNurseId = staffNurseIdIn;
    }
    
}
