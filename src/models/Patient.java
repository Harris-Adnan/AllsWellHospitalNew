/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;

/**
 *
 * @author Harris
 */
public class Patient {
    
    //Attributes
    private int patientNo;
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String postcode;
    private String dob;
    private String homeTel;
    private String mobileNo;
    private Date dateAdmitted;
    private String type;
    private String teamCode;
    private String wardName;
    private String discharge;
    
    @Override
    public String toString()
    {
        return ("Patient No " + patientNo + " - " + firstName + " " + lastName);
    } 
    
    //Getters
    public int getPatientNo(){
        
        return patientNo;
        
    }
    public String getFirstName(){
        
        return firstName;
        
    }
    public String getLastName(){
        
        return lastName;
        
    }
    public String getStreet(){
        
        return street;
        
    }
    public String getCity(){
        
        return city;
        
    }
    public String getPostcode(){
        
        return postcode;
        
    }
    public String getDOB(){
        
        return dob;
        
    }
    public String getHomeTel(){
        
        return homeTel;
        
    }
    public String getMobileNo(){
        
    return mobileNo;
        
    }
    public Date getDateAdmitted(){
        
    return dateAdmitted;
        
    }
    
    public String getType(){
        
    return type;
        
    }
    
    public String getTeamCode(){
        
    return teamCode;
        
    }
    
    public String getWardName(){
        
    return wardName;
        
    }
    
    public String getDischarge(){
        
    return discharge;
        
    }
    
     //Setters
    
    public void  setPatientNo(int patientNoIn) {
        
        patientNo = patientNoIn;
    }
    public void  setFirstName(String firstNameIn) {
        
        firstName = firstNameIn;
    }
    public void  setLastName(String lastNameIn) {
        
        lastName = lastNameIn;
    }
    public void  setStreet(String streetIn) {
        
        street = streetIn;
    }
    public void  setCity(String cityIn) {
        
        city = cityIn;
    }
    public void  setPostcode(String postcodeIn) {
        
        postcode = postcodeIn;
    }
    public void  setDOB(String dobIn) {
        
        dob = dobIn;
    }
    public void  setHomeTel(String homeTelIn) {
        
        homeTel = homeTelIn;
    }
    public void  setMobileNo(String mobileNoIn) {
        
        mobileNo = mobileNoIn;
    }
    public void  setDateAdmitted(Date dateAdmittedIn) {
        
        dateAdmitted = dateAdmittedIn;
    }
    
    public void  setType(String typeIn) {
        
        type = typeIn;
    }
    
    public void  setTeamCode(String teamCodeIn) {
        
        teamCode = teamCodeIn;
    }
    
    public void  setWardName(String wardNameIn) {
        
        wardName = wardNameIn;
    }
    
    public void  setDischarge(String dischargeIn) {
        
        discharge = dischargeIn;
    }
    
    
    //0 parameter constructor
    
    public Patient() {
        patientNo = 0;
        firstName = "";
        lastName = "";
        street = "";
        city = "";
        postcode = "";
        dob = "";
        homeTel = "";
        mobileNo = "";
        dateAdmitted = new Date();
        type = "";
        teamCode = "";
        wardName = "";
        discharge = "";
        
    }
    
    //overloaded constructor
    
    public Patient(int patientNoIn, String firstNameIn, String lastNameIn, String streetIn, String cityIn, String postcodeIn, String dobIn, String homeTelIn, String mobileNoIn, Date dateAdmittedIn, String typeIn, String teamCodeIn, String wardNameIn) {
        
        patientNo = patientNoIn;
        firstName = firstNameIn;
        lastName = lastNameIn;
        street = streetIn;
        city = cityIn;
        postcode = postcodeIn;
        dob = dobIn;
        homeTel = homeTelIn;
        mobileNo = mobileNoIn;
        dateAdmitted = dateAdmittedIn;
        type = typeIn;
        teamCode = teamCodeIn;
        wardName = wardNameIn;
        
    }
    
    //2nd Overloaded Constructor without Patient No
    //overloaded constructor
    
    public Patient(String firstNameIn, String lastNameIn, String streetIn, String cityIn, String postcodeIn, String dobIn, String homeTelIn, String mobileNoIn, Date dateAdmittedIn, String typeIn, String teamCodeIn, String wardNameIn) {
        
        
        firstName = firstNameIn;
        lastName = lastNameIn;
        street = streetIn;
        city = cityIn;
        postcode = postcodeIn;
        dob = dobIn;
        homeTel = homeTelIn;
        mobileNo = mobileNoIn;
        dateAdmitted = dateAdmittedIn;
        type = typeIn;
        teamCode = teamCodeIn;
        wardName = wardNameIn;

    }
    
    //3rd Overloaded Constructor with just wardName and patientNo
    //overloaded constructor
    
    public Patient(String wardNameIn, int patientNoIn) {
        
        
        wardName = wardNameIn;
        patientNo = patientNoIn;

    }
    
    //4th Overloaded Constructor with just teamCode and patientNo
    //overloaded constructor
    
    public Patient( int patientNoIn, String teamCodeIn) {
        
        
        teamCode = teamCodeIn;
        patientNo = patientNoIn;

    }
    
    //5th Overloaded Constructor with just discharge and patientNo
    //overloaded Constructor
    
    public Patient( int patientNoIn, String dischargeIn, String empty) {
        
        
        discharge = dischargeIn;
        patientNo = patientNoIn;

    }
    
}
