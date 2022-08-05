/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mentalku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AF Syauqi
 */
public class Koneksi {
    public static Connection getConnection(){
        Connection conn = null;
        String jdbc_driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/mentalku";
        try{
            conn = DriverManager.getConnection(url, user, pass);
            System.out.print("Berhasil konek");
        }catch(SQLException e){
            System.out.println(e);
        }
        return conn;
    }
}
