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
public class Drug {
    
    //private attributes
    private int drugId;
    private String drugName;
    private double price;
    private int stockLevel;
    private String dosage;
    
    @Override
    public String toString()
    {
        return (drugName);
    } 
    
    
    //Getters
    
    
    public int getDrugId(){
        
        return drugId;
        
    }
    
    public String getDrugName(){
        
        return drugName;
        
    }
    
    public double getPrice(){
        
        return price;
        
    }
    
    public int getStockLevel(){
        
        return stockLevel;
        
    }
    
    public String getDosage(){
        
        return dosage;
        
    }
    
    //Setters
   
    public void  setDrugId(int drugIdIn) {
        
        drugId = drugIdIn;
    }
    
    public void  setDrugName(String drugNameIn) {
        
        drugName = drugNameIn;
    }
    
    public void  setPrice(double priceIn) {
        
        price = priceIn;
    }
    
    public void  setStockLevel(int stockLevelIn) {
        
        stockLevel = stockLevelIn;
    }
    
    public void  setDosage(String dosageIn) {
        
        dosage = dosageIn;
    }
    
    //0 parameter constructor
    
    public Drug() {
        drugId = 0;
        drugName = "";
        price = 0.0;
        stockLevel = 0;
        dosage = "";
    }
    
    //overloaded constructor
    
    public Drug(int drugIdIn, String drugNameIn, double priceIn, int stockLevelIn, String dosageIn) {
        
        drugId = drugIdIn;
        drugName = drugNameIn;
        price = priceIn;
        stockLevel = stockLevelIn;
        dosage = dosageIn;
    }
    
     public Drug( String drugNameIn, double priceIn, int stockLevelIn, String dosageIn) {
        
        
        drugName = drugNameIn;
        price = priceIn;
        stockLevel = stockLevelIn;
        dosage = dosageIn;
     }
    
}
