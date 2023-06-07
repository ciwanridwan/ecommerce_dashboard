/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ciwan
 */
public class mysql {
    private Connection con;
    
    public Connection connect() {
        try {
            String user = "root";
            String password = "Password123#";
            String url = "jdbc:mysql://localhost:3306/java_ecommerce";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Ini berhasil konek");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connect Failed" + e);
        }
        
        return con;
    }
}
