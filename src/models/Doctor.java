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
public class Doctor extends User{
    
    
    private String teamcode;
    private double doctorFees;
    
    //Getters
    
    public String getTeamCode(){
        
        return teamcode;
        
    }
    
    public double getDoctorFees(){
        
        return doctorFees;
        
    }
    
    //Setters
    
    public void  setTeamcode(String teamcodeIn) {
        
        teamcode = teamcodeIn;
    }
    
    public void  setDoctorFees(double doctorFeesIn) {
        
        doctorFees = doctorFeesIn;
    }
    
    //0 param constructor
    public Doctor() {
        //user
        super();

        teamcode = "";
        doctorFees = 0.0;
    }
    
    //fully loaded constructor
    public Doctor(String usernameIn, String passwordIn, String firstnameIn, String lastnameIn, String addressIn, String postCodeIn, String teamcodeIn, double doctorFeesIn) {
        
        //user class over loaded
        super(usernameIn, passwordIn, firstnameIn, lastnameIn, addressIn, postCodeIn);

        teamcode = teamcodeIn;
        doctorFees = doctorFeesIn;
    }
    
    //fully loaded constructor with TeamCode
    public Doctor( String teamcodeIn) {
       

        teamcode = teamcodeIn;
    }
    
    
    
}
