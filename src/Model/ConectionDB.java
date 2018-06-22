/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SALA4
 */
public class ConectionDB {

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/Students";
    private Connection connect;
    private static final String USER = "root";
    private static final String PassWord = "";
    
    public boolean isConnected() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        boolean state =false;
        Class.forName(driver).newInstance();
        connect = DriverManager.getConnection(URL,USER,PassWord);
        state=true;
        return state;
    }
    

    public ConectionDB() {

    }


    public Connection getConnect() {
        return connect;
    }

}
