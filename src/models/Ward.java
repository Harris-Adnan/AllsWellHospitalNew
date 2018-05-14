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
public class Ward {
    
    //private attribute
    private int wardId;
    private String wardName;
    
    @Override
    public String toString()
    {
        return (wardName);
    } 
    
    //Getters
    public String getWardName(){
        
        return wardName;
        
    }
    
    public int getWardId(){
        
        return wardId;
        
    }
    
    //Setters
    
    public void  setWardName(String wardNameIn) {
        
        wardName = wardNameIn;
    }
    
     public void  setWardId(int wardIdIn) {
        
        wardId = wardIdIn;
    }
    
    //0 parameter constructor
    
    public Ward() {
        
        wardName = "";  
        wardId = 0;

    }
    
    //overloaded constructor
    
    public Ward(String wardNameIn, int wardIdIn) {
        
        wardName = wardNameIn;
        wardId = wardIdIn;

    }
    
    
}
