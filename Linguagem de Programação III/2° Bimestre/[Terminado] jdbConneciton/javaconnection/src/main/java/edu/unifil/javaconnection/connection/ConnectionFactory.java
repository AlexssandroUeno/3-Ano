/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unifil.javaconnection.connection;

import edu.unifil.javaconnection.models.ConnectionBean;
import edu.unifil.javaconnection.util.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Guidetti
 */
public class ConnectionFactory {

    private ConnectionBean cfg;
    
    private static ConnectionFactory instance;
    
    
    
    private ConnectionFactory() {
    }
    
    public static ConnectionFactory getInstance() {
        if(instance == null)
            instance = new ConnectionFactory();
        return instance;
    }
    
    public Connection getConnection() throws SQLException {
        //jdbc:mysql://" + url + ":" + port + "/" + database + "-" + username + "-" + password;
        cfg = Util.getStringConnection();
            return DriverManager.getConnection("jdbc:mysql://"
                    +cfg.getUrl()+":"
                    +cfg.getPort()+"/"
                    +cfg.getDatabase(),
                    cfg.getUsername(),
                    cfg.getPassword());
    }
}
