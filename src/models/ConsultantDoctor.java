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
public class ConsultantDoctor extends Doctor{
    
    private String consultantId;
    
    //getters
    
     public String getConsultantsId(){
        
        return consultantId;
        
    }
     
      //Setters
    
    public void  setConsultantId(String consultantIdIn) {
        
        consultantId = consultantIdIn;
    }
    
    //0 param constructor
    public ConsultantDoctor() {
        //Doctor
        super();
        consultantId = "";
    }
    
    //fully loaded constructor
    public ConsultantDoctor(String usernameIn, String passwordIn, String firstnameIn, String lastnameIn, String addressIn, String postcodeIn, String teamcodeIn, double doctorFeesIn, String consultantIdIn) {
        
        //Doctor class over loaded
        super(usernameIn, passwordIn, firstnameIn, lastnameIn, addressIn, postcodeIn, teamcodeIn, doctorFeesIn);
        
        consultantId = consultantIdIn;
    }
    
}
