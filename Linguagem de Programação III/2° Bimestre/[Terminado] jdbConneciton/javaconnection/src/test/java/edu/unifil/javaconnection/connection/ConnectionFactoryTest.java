/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unifil.javaconnection.connection;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Ignore;

/**
 *
 * @author Guidetti
 */
public class ConnectionFactoryTest {
       
    @Ignore
    public void conectar() throws SQLException {
        Connection con = ConnectionFactory.getInstance().getConnection();
    }
}
