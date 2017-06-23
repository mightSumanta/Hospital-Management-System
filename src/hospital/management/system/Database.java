/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.management.system;

import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Sumanta
 */
public class Database 
{
 
    Connection conn = null;
    public static Connection java_db()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sumanta\\Documents\\NetBeansProjects\\Hospital Management System\\myDatabase.sqlite");
            return conn;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
