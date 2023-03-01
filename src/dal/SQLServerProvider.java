/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author hiepg
 */
public class SQLServerProvider {
    private Connection connection;
    public void open(){
        String StrServerName = "DESKTOP-95UDENR\\SQLEXPRESS";
        String StrDatabase = "Java";
        String user = "sa";
        String pass = "sa";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String conURL = "jdbc:sqlserver://" + StrServerName 
                    + ":1433;databaseName = " + StrDatabase
                    + ";user = " + user
                    + ";password = " + pass;
            connection = DriverManager.getConnection(conURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void close(){
        try {
            this.connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public ResultSet executeQuery(String sql){
        ResultSet rs = null;
        try {
            Statement sm = connection.createStatement();
            rs = sm.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    public int executeUpdate(String sql){
        int n = -1;
        try {
            Statement sm = connection.createStatement();
            n = sm.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
}
