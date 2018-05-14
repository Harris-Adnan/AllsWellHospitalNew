/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Harris
 */
public class DBManager {
    
    //updating the Team information for patient
    public void authoriseDischarge (Patient newDischargeAuthorisation)
    {
        
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE Patient SET Authroisation = '" + newDischargeAuthorisation.getDischarge()+ "'" + " WHERE PatientID = '" + newDischargeAuthorisation.getPatientNo()+ "'");
                    conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
    }
    
    //deleting the Patients drug from the database
    public void deletePatientsDrug (PatientsDrugs drug)
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM PatientsDrugs WHERE DrugLineID = '" + drug.getDrugLineId()+ "'");
        }
        catch(Exception ex)
                {
                    String message = ex.getMessage();
                }
    }
    
    //loading the patients drugs from the database
    public HashMap<Integer, PatientsDrugs> loadPatientsDrugs()
    {
        HashMap<Integer, PatientsDrugs> patientsDrugs = new HashMap();
        
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PatientsDrugs");
            
            while (rs.next()) 
            {
                int drugLineId = rs.getInt("DrugLineID");
                int patientId = rs.getInt("PatientID");
                int drugId = rs.getInt("DrugID");
                String drugName = rs.getString("DrugName");
                String dosage = rs.getString("Dosage");
                double price = rs.getDouble("Price");
                
                 
                    PatientsDrugs loadedPatientsDrugs = new PatientsDrugs(drugLineId, patientId, drugId, drugName, dosage, price);
                    patientsDrugs.put(drugLineId, loadedPatientsDrugs);
                
            }
            conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
        finally
        {
            return patientsDrugs;
        }
    }
    
    //adding the drugs to the database
     public void addPatientsDrug(PatientsDrugs newDrug)
     {
         
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO PatientsDrugs (PatientID, DrugID, DrugName, Dosage, Price) VALUES " + 
            "('" + newDrug.getPatientId() 
                    + "','" + newDrug.getDrugId() 
                    + "','" + newDrug.getDrugName() 
                    + "','" + newDrug.getDosage() 
                    + "','" + newDrug.getPrice() + "')");
            conn.close();
        }
        catch(Exception ex)
        {
            String message = ex.getMessage();
        }

     }
    
    //deleting the drug from the database
    public void deleteDrug (Drug drug)
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM Drug WHERE DrugID = '" + drug.getDrugId()+ "'");
        }
        catch(Exception ex)
                {
                    String message = ex.getMessage();
                }
    }
    
    //updating the drug information
    public void updateDrug (Drug newDrug)
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE Drug SET DrugName = '" + newDrug.getDrugName()+ "', Price = '" + newDrug.getPrice() + "', " +
                    "StockLevel = '" + newDrug.getStockLevel() + "', Dosage = '" + newDrug.getDosage() + 
                            "' WHERE DrugID = '" + newDrug.getDrugId()+ "'");
                    conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
    }
    
    //loading the drugs from the database
    public HashMap<Integer, Drug> loadDrugs()
    {
        HashMap<Integer, Drug> drugs = new HashMap();
        
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Drug");
            
            while (rs.next()) 
            {
                int drugId = rs.getInt("DrugID");
                String drugName = rs.getString("DrugName");
                double price = rs.getDouble("Price");
                int stockLevel = rs.getInt("StockLevel");
                String dosage = rs.getString("Dosage");
                 
                    Drug loadedDrug = new Drug(drugId, drugName, price, stockLevel, dosage);
                    drugs.put(drugId, loadedDrug);
                
            }
            conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
        finally
        {
            return drugs;
        }
    }
    
    //adding the drugs to the database
     public void addDrug(Drug newDrug)
     {
         
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO Drug (DrugName, Price, StockLevel, Dosage) VALUES " + 
            "('" + newDrug.getDrugName() + "','" + newDrug.getPrice() + "','" + newDrug.getStockLevel() +
                    "','" + newDrug.getDosage() +  "')");
            conn.close();
        }
        catch(Exception ex)
        {
            String message = ex.getMessage();
        }

     }
    
   //updating the Team information for Junior
    public void updateJuniorTeam (JuniorDoctor newJuniorTeam)
    {
        
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE JuniorDoctor SET TeamCode = '" + newJuniorTeam.getTeamCode()+ "'" + " WHERE JuniorID = '" + newJuniorTeam.getJuniorId()+ "'");
                    conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
    }
    
    //updating the Team information for patient
    public void updateTeam (Patient newPatientTeam)
    {
        
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE Patient SET TeamCode = '" + newPatientTeam.getTeamCode()+ "'" + " WHERE PatientID = '" + newPatientTeam.getPatientNo()+ "'");
                    conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
    }
    
    //loading the wards from the database
    public HashMap<Integer, TeamOfDoctors> loadTeams()
    {
        HashMap<Integer, TeamOfDoctors> teams = new HashMap();
        
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM TeamOfDoctors");
            
            while (rs.next()) 
            {
                int teamId = rs.getInt("TeamID");
                String teamCode = rs.getString("TeamCode");
                 
                    TeamOfDoctors loadedTeam = new TeamOfDoctors(teamCode, teamId);
                    teams.put(teamId, loadedTeam);
                
            }
            conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
        finally
        {
            return teams;
        }
    }
    
    //updating the product information
    public void updateWard (Patient newPatientWard)
    {
        
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE Patient SET WardName = '" + newPatientWard.getWardName()+ "'" + " WHERE PatientId = '" + newPatientWard.getPatientNo()+ "'");
                    conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
    }
    
    //loading the wards from the database
    public HashMap<Integer, Ward> loadWards()
    {
        HashMap<Integer, Ward> wards = new HashMap();
        
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Ward");
            
            while (rs.next()) 
            {
                int wardId = rs.getInt("WardID");
                String wardName = rs.getString("WardName");
                 
                    Ward loadedWard = new Ward(wardName, wardId);
                    wards.put(wardId, loadedWard);
                
            }
            conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
        finally
        {
            return wards;
        }
    }
    
    //loading the patients from the database
    public HashMap<Integer, Patient> loadPatients()
    {
        HashMap<Integer, Patient> patients = new HashMap();
        
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Patient");
            
            while (rs.next()) 
            {
                int patientId = rs.getInt("PatientID");
                String patientType = rs.getString("PatientType");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String dob = rs.getString("DateOfBirth");
                String homeTel = rs.getString("HomeTelephone");
                String mobileNumber = rs.getString("MobileNumber");
                String address = rs.getString("Address");
                String city = rs.getString("City");
                String postcode = rs.getString("Postcode");
                Date dateAdmitted = rs.getDate("AdmissionDate");
                String teamCode = rs.getString("TeamCode");
                String wardName = rs.getString("WardName");
                   
                
                     
                    
                    Patient loadedPatient = new Patient(patientId, firstName, lastName, address, city, postcode, dob, homeTel, mobileNumber, dateAdmitted, patientType, teamCode, wardName);
                    patients.put(patientId, loadedPatient);
                
            }
            conn.close();
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
        finally
        {
            return patients;
        }
    }
    
    
    //admitting the patient. Add to the database
     public void admitPatient(Patient newPatient)
     {
  
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO Patient (PatientType, FirstName, LastName, DateOfBirth, HomeTelephone, MobileNumber, Address, City, Postcode, AdmissionDate, TeamCode, WardName) VALUES " + 
            "('" + newPatient.getType() + 
            "','" + newPatient.getFirstName() + 
            "','" + newPatient.getLastName() +
            "','" + newPatient.getDOB() + 
            "','" + newPatient.getHomeTel() +   
            "','" + newPatient.getMobileNo() + 
            "','" + newPatient.getStreet() +
            "','" + newPatient.getCity() + 
            "','" + newPatient.getPostcode() +         
            "','" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(newPatient.getDateAdmitted())+
            "','" + newPatient.getTeamCode()+ 
            "','" + newPatient.getWardName() + "')");
            conn.close();
            //newPatient.getTeamCode()
            //new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(o.getOrderDate())
        }
        catch(Exception ex)
        {
            String message = ex.getMessage();
        }
         
         
         
         
         
     }
    
    
    //this function is used to match the Ward Sisters username and password
    public WardSister sisterLogin(String username, String password)
    {
        HashMap<String, WardSister> sister = loadSister();
        
        if(sister.containsKey(username)){
            
            WardSister foundSister = sister.get (username);
            
            if (foundSister.getPassword().equals(password)){
                return foundSister;
            }
        }
        //if not found return null
        return null;
    }
    
    //loading Ward Sister from the databse
     public HashMap<String, WardSister> loadSister() 
    {
        HashMap<String, WardSister> sister = new HashMap<>();
        
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM WardSister");
            
            
            while (rs.next()) {
                
                String wardSisterId = rs.getString("WardSisterID");
                String username = rs.getString("UserName");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String address = rs.getString("Address");
                String postcode = rs.getString("Postcode");     
                
                
                WardSister loadedSister = new WardSister( username, password, firstName, lastName, address, postcode, wardSisterId);
                
                sister.put(username, loadedSister);  
                
            }
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
        finally
        {
            return sister;
        }
    }
    
    //this function is used to match the Medical Record Staffs username and password
    public MedicalRecordStaff medicalLogin(String username, String password)
    {
        HashMap<String, MedicalRecordStaff> medical = loadMedical();
        
        if(medical.containsKey(username)){
            
            MedicalRecordStaff foundMedical = medical.get (username);
            
            if (foundMedical.getPassword().equals(password)){
                return foundMedical;
            }
        }
        //if not found return null
        return null;
    }
    
    //loading Medical Record Staff from the databse
     public HashMap<String, MedicalRecordStaff> loadMedical() 
    {
        HashMap<String, MedicalRecordStaff> medical = new HashMap<>();
        
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM MedicalRecordStaff");
            
            
            while (rs.next()) {
                
                String medicalStaffId = rs.getString("MedicalRecordStaffID");
                String username = rs.getString("UserName");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String address = rs.getString("Address");
                String postcode = rs.getString("Postcode");     
                
                
                MedicalRecordStaff loadedMedical = new MedicalRecordStaff( username, password, firstName, lastName, address, postcode, medicalStaffId);
                
                medical.put(username, loadedMedical);  
                
            }
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
        finally
        {
            return medical;
        }
    }
    
    
    //this function is used to match the Juniors username and password
    public JuniorDoctor juniorLogin(String username, String password)
    {
        HashMap<String, JuniorDoctor> junior = loadJunior();
        
        if(junior.containsKey(username)){
            
            JuniorDoctor foundJunior = junior.get (username);
            
            if (foundJunior.getPassword().equals(password)){
                return foundJunior;
            }
        }
        //if not found return null
        return null;
    }
    
    //loading Junior Doctor from the databse
     public HashMap<String, JuniorDoctor> loadJunior() 
    {
        HashMap<String, JuniorDoctor> junior = new HashMap<>();
        
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM JuniorDoctor");
            
            
            while (rs.next()) {
                
                String juniorId = rs.getString("JuniorID");
                String username = rs.getString("UserName");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String address = rs.getString("Address");
                String postcode = rs.getString("Postcode");
                String teamcode = rs.getString("TeamCode");
                double doctorFees = rs.getDouble("DoctorFees");
                String grade = rs.getString("Grade");
                
                
                JuniorDoctor loadedJunior = new JuniorDoctor( username, password, firstName, lastName, address, postcode, teamcode, doctorFees, juniorId, grade);
                
                junior.put(username, loadedJunior);  
                
            }
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
        finally
        {
            return junior;
        }
    }
    
    
    //this function is used to match the consultants username and password
    public ConsultantDoctor consultantLogin(String username, String password)
    {
        HashMap<String, ConsultantDoctor> consultant = loadConsultant();
        
        if(consultant.containsKey(username)){
            
            ConsultantDoctor foundConsultant = consultant.get (username);
            
            if (foundConsultant.getPassword().equals(password)){
                return foundConsultant;
            }
        }
        //if not found return null
        return null;
    }
    
    //loading consultant from the databse
     public HashMap<String, ConsultantDoctor> loadConsultant() 
    {
        HashMap<String, ConsultantDoctor> consultant = new HashMap<>();
        
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://E:\\Year 2\\Final Assesment\\Actual Project Java\\AllsWellHospital\\Data\\AllsWellDB.accdb");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Consultant");
            
            
            while (rs.next()) {
                
                String consultantId = rs.getString("ConsultantID");
                String username = rs.getString("UserName");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String address = rs.getString("Address");
                String postcode = rs.getString("Postcode");
                String teamcode = rs.getString("TeamCode");
                double doctorFees = rs.getDouble("DoctorFees");
                
                
                ConsultantDoctor loadedConsultant = new ConsultantDoctor( username, password, firstName, lastName, address, postcode, teamcode, doctorFees, consultantId);
                
                consultant.put(username, loadedConsultant);  
                
            }
        }
        catch (Exception ex)
        {
            String message = ex.getMessage();
        }
        finally
        {
            return consultant;
        }
    }
    
}
