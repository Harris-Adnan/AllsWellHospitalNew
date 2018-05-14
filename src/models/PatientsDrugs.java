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
public class PatientsDrugs {
    
    //Attributes
    private int drugLineId;
    private int patientId;
    private int drugId;
    private String drugName;
    private String dosage;
    private double price;
    
    @Override
    public String toString()
    {
        return ("Patient No " + patientId + " - " + drugName + " " + dosage);
    } 
    
    //Getters
    public int getDrugLineId(){
        
        return drugLineId;
        
    }
    public int getPatientId(){
        
        return patientId;
        
    }
    public int getDrugId(){
        
        return drugId;
        
    }
    public String getDrugName(){
        
        return drugName;
        
    }
    public String getDosage(){
        
        return dosage;
        
    }
    public double getPrice(){
        
        return price;
        
    }
    
    //Setters
    
    public void  setDrugLineId(int drugLineIdIn) {
        
        drugLineId = drugLineIdIn;
    }
    public void  setPatientId(int patientIdIn) {
        
        patientId = patientIdIn;
    }
    public void  setDrugId(int drugIdIn) {
        
        drugId = drugIdIn;
    }
    public void  setDrugName(String drugNameIn) {
        
        drugName = drugNameIn;
    }
    public void  setDosage(String dosageIn) {
        
        dosage = dosageIn;
    }
    public void  setPrice(Double priceIn) {
        
        price = priceIn;
    }
    
    //0 parameter constructor
    
    public PatientsDrugs() {
        drugLineId = 0;
        patientId = 0;
        drugId = 0;
        drugName = "";
        dosage = "";
        price = 0.0;
    }
    
    //overloaded constructor
    
    public PatientsDrugs(int drugLineIdIn, int patientIdIn, int drugIdIn, String drugNameIn, String dosageIn, double priceIn) {
        
        drugLineId = drugLineIdIn;
        patientId = patientIdIn;
        drugId = drugIdIn;
        drugName = drugNameIn;
        dosage = dosageIn;
        price = priceIn;
        
    }
    
    //2nd overloaded constructor without druglineId
    
    public PatientsDrugs( int patientIdIn, int drugIdIn, String drugNameIn, String dosageIn, double priceIn) {
        
        patientId = patientIdIn;
        drugId = drugIdIn;
        drugName = drugNameIn;
        dosage = dosageIn;
        price = priceIn;
        
    }
    
}
