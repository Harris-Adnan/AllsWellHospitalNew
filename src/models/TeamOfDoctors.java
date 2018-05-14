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
public class TeamOfDoctors {
    
    //private attribute
    private int teamId;
    private String teamCode;
    
    @Override
    public String toString()
    {
        return (teamCode);
    } 
    
    //Getters
    public String getTeamCode(){
        
        return teamCode;
        
    }
    
    public int getTeamId(){
        
        return teamId;
        
    }
    
    //Setters
    
    public void  setTeamCode(String teamCodeIn) {
        
        teamCode = teamCodeIn;
    }
    
     public void  setTeamId(int teamIdIn) {
        
        teamId = teamIdIn;
    }
    
    //0 parameter constructor
    
    public TeamOfDoctors() {
        
        teamCode = "";  
        teamId = 0;

    }
    
    //overloaded constructor
    
    public TeamOfDoctors(String teamCodeIn, int teamIdIn) {
        
        teamCode = teamCodeIn;
        teamId = teamIdIn;

    }
    
}
