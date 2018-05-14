/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allswellhospital.View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.swing.SwingWorker;
import models.DBManager;
import models.Drug;


/**
 *
 * @author Harris
 */
public class AllsWellHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Code For splash Screen
        //Accessing label and loading bar from SplashScreen jFrame

        SplashScreen splash = new SplashScreen();
        splash.setVisible(true);
        MainMenu main = new MainMenu();

        //try catch setting timer for label with numbers and loading bar
        try {
//            for (int i = 0; i <=100; i++) {
//                Thread.sleep(40);
//                SplashScreen.lblLoadingNumbers.setText(Integer.toString(i)+"%");
//                SplashScreen.LoadingNumbersBar.setValue(i);
//                //once loading complete closing splashScreen and opening MainMenu
//               
//                DBManager dbManager = new DBManager();
//                dbManager.loadDrugs();
//                if(i==100)
//                {
//                    splash.setVisible(false);
//                    main.setVisible(true);
//                }
//            }

            /**
             * This is to load the database connection and kill any runtime wait
             */
            DBManager dbManager = new DBManager();
            HashMap<Integer, Drug> drugMap = dbManager.loadDrugs();

            int i = 1;
            for (Map.Entry<Integer, Drug> entry : drugMap.entrySet()) {
                int row = i * (100 / drugMap.size());
                SplashScreen.lblLoadingNumbers.setText(row + "%");
                SplashScreen.LoadingNumbersBar.setValue(row);
                i++;
                Thread.sleep(300);
            }
            splash.setVisible(false);
            main.setVisible(true);

        } catch (Exception e) {

        }
    }

}
