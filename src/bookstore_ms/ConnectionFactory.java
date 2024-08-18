/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore_ms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Diem Khang
 */
public class ConnectionFactory {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://26.206.237.71:3306/";
            String user = "bsm";
            String password = "123456";
            Class.forName("com.mysql.cj.jdbc.Driver"); //driver class in properties of services databases xampp
            conn = DriverManager.getConnection(url + "bookshopmanagement", user, password);
            
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e);
        }catch(SQLException e){
            System.out.println("SQLException: "+ e);
        }
        return conn;
    }
    
}
