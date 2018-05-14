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
public class JuniorDoctor extends Doctor{
    
    private String juniorId;
    private String grade;
    
    @Override
    public String toString()
    {
        return (juniorId + " " + super.getFirstname());
    } 
    
    
    //getters
     public String getJuniorId(){
        
        return juniorId;
        
    }
    
    public String getGrade(){
        
        return grade;
        
    }

     //Setters
    
    public void  setJuniorId(String juniorIdIn) {
        
        juniorId = juniorIdIn;
    }
    
    public void  setGrade(String gradeIn) {
        
        grade = gradeIn;
    }
    
    
    //0 param constructor
    public JuniorDoctor() {
        //Doctor
        super();
        juniorId = "";
        grade = "";
    }
    
    //fully loaded constructor
    public JuniorDoctor(String usernameIn, String passwordIn, String firstnameIn, String lastnameIn, String addressIn, String postcodeIn, String teamcodeIn, double doctorFeesIn, String juniorIdIn, String gradeIn) {
        
        //Doctor class over loaded
        super(usernameIn, passwordIn, firstnameIn, lastnameIn, addressIn, postcodeIn, teamcodeIn, doctorFeesIn);
        
        juniorId = juniorIdIn;
        grade = gradeIn;
    }
    
    //fully loaded constructor
    public JuniorDoctor(String teamcodeIn, String juniorIdIn) {
        
        //Doctor class over loaded
        super(teamcodeIn);
        
        juniorId = juniorIdIn;
    }
    
    
    
}
