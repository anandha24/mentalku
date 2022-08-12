/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentalku;

import java.util.Scanner;

//import com.mysql.cj.log.LogFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author RISA, ANAN, SYAUQI
 */
public class Mentalku {
    
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
                Login login = new Login();
//                Admin admin = new Admin();
//                admin.setVisible(true);
                login.setVisible(true);
        }
    
}
