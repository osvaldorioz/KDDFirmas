/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uca.unidad.uno.kdd.connect2db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author OR501695
 */
public class Connector {
    private Connection conn = null;
        
    public Connector(){
        try {
            
            String url = "jdbc:sqlite:sample.db";
            
            conn = DriverManager.getConnection(url);
            
            System.out.println("Se estableció una conexión a SQLite.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    /**
     *
     * @return
     */
    public Connection getConnection(){
        try {
            String url = "jdbc:sqlite:sample.db";            
            conn = DriverManager.getConnection(url);           
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return conn;
    }
    
}
