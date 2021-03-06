/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allswellhospital.View;

import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import models.ConsultantDoctor;
import models.DBManager;
import models.Patient;

/**
 *
 * @author Harris
 */
public class ConsultantViewPatientTeam extends javax.swing.JFrame {

    /**
     * Creates new form ConsultantViewPatientTeam
     */
    private ConsultantDoctor loggedInConsultant;
    private HashMap<Integer,Patient>patients;
    private Patient selectedPatient;
    
    public ConsultantViewPatientTeam(ConsultantDoctor consultantIn) {
        loggedInConsultant = consultantIn;
        DBManager db = new DBManager();
        patients = db.loadPatients();
        
        initComponents();
         

        //This part of the code fills the Listbox with patients which only the doctor can treat matching team code
        DefaultListModel model = new DefaultListModel();

         for(Map.Entry<Integer, Patient> patientEntry : patients.entrySet())
        {
            Patient currentPatient = patientEntry.getValue();
            String teamCode = loggedInConsultant.getTeamCode();
                     String patientTeamCode = currentPatient.getTeamCode();
                     if(teamCode.equals(patientTeamCode))
                     {
                     
                      model.addElement(currentPatient);
                     }
            
            
                
        }
        lstPatients.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTreat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPatients = new javax.swing.JList<>();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel2.setText("Patients List With Same Team Code");

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Patient");

        btnTreat.setText("Treat Patient");
        btnTreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatActionPerformed(evt);
            }
        });

        lstPatients.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPatientsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPatients);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(166, 166, 166))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addGap(208, 208, 208))
                    .addComponent(jLabel2))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnTreat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReturn)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnTreat)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        ConsultantHome home = new ConsultantHome(loggedInConsultant);
        this.dispose();
        home.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void lstPatientsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPatientsValueChanged
        //this sets the patient which is selected in the patient list box
        Object selectedPatientObject = (Object)lstPatients.getSelectedValue();
        
        selectedPatient = (Patient)selectedPatientObject;
        
        lblMessage.setText("");
    }//GEN-LAST:event_lstPatientsValueChanged

    private void btnTreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatActionPerformed
        // this checks to see if a patient has been selected
        if(lstPatients.getSelectedIndex() != -1)
        {     
            //when a patient has been selected the Ward sister is taken to AddWard page 
            ConsultantTreatPatient treat = new ConsultantTreatPatient(loggedInConsultant, selectedPatient);
            this.dispose();
            treat.setVisible(true);
        }
            else
            {
                lblMessage.setText("Please First Select The Patient");
            }
    }//GEN-LAST:event_btnTreatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultantViewPatientTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultantViewPatientTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultantViewPatientTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultantViewPatientTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new ConsultantViewPatientTeam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnTreat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JList<String> lstPatients;
    // End of variables declaration//GEN-END:variables
}
