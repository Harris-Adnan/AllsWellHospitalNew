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
public class User {
    
    //private attributes
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String address;
    private String postcode;
    
    public String greeting()
    {
        String greeting = "<html>Welcome " + this.getFirstname() + "<br>You have successfully logged in!<br> </html>";
        
       
       
        return greeting;
    }
    
    
    //Getters
    public String getUsername(){
        
        return username;
        
    }
    
    public String getPassword(){
        
        return password;
        
    }
    
    public String getFirstname(){
        
        return firstname;
        
    }
    
    public String getLastname(){
        
        return lastname;
        
    }
    
    public String getAddress(){
        
        return address;
        
    }
    
    public String getPostcode(){
        
        return postcode;
        
    }
    
    
    //Setters
    
    public void  setUsername(String usernameIn) {
        
        username = usernameIn;
    }
    
    public void  setPassword(String passwordIn) {
        
        password = passwordIn;
    }
    
    public void  setFirstname(String firstnameIn) {
        
        firstname = firstnameIn;
    }
    
    public void  setLastname(String lastnameIn) {
        
        lastname = lastnameIn;
    }
    
     public void  setAddress(String addressIn) {
        
        address = addressIn;
    }
    
    public void  setPostcode(String postcodeIn) {
        
        postcode = postcodeIn;
    }
    
    //0 parameter constructor
    
    public User() {
        username = "";
        password = "";
        firstname = "";
        lastname = "";
        address = "";
        postcode = "";  

    }
    
    //overloaded constructor
    
    public User(String usernameIn, String passwordIn, String firstnameIn, String lastnameIn, String addressIn, String postcodeIn) {
        
        username = usernameIn;
        password = passwordIn;
        firstname = firstnameIn;
        lastname = lastnameIn;
        address = addressIn;
        postcode = postcodeIn;
        
    }
    
}
