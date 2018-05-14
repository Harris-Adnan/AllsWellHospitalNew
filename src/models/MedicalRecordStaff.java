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
public class MedicalRecordStaff extends User{
    
    private String medicalStaffId;
    
    //Getters
    public String getMedicalStaffId(){
        
        return medicalStaffId;
        
    }
    
    //Setters
    
    public void  setMedicalStaffId(String medicalStaffIdIn) {
        
        medicalStaffId = medicalStaffIdIn;
    }
    
     //0 param constructor
    public MedicalRecordStaff() {
        //user
        super();
        medicalStaffId = "";
    }
    
     //fully loaded constructor
    public MedicalRecordStaff(String usernameIn, String passwordIn, String firstnameIn, String lastnameIn, String addressIn, String postCodeIn, String medicalStaffIdIn) {
        
        //user class over loaded
        super(usernameIn, passwordIn, firstnameIn, lastnameIn, addressIn, postCodeIn);
        
        medicalStaffId = medicalStaffIdIn;
    }
    
}
