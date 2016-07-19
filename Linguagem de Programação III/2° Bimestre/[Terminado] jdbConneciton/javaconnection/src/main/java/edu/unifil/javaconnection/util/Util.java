/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unifil.javaconnection.util;

import edu.unifil.javaconnection.models.ConnectionBean;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Guidetti
 */
public class Util {

    public static ConnectionBean getStringConnection() {
        JSONParser parser = new JSONParser();
        ConnectionBean c = null;
        try {

            Object obj = parser.parse(new FileReader(
                    "config/config.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String username = (String) jsonObject.get("username");
            String password = (String) jsonObject.get("password");
            String url = (String) jsonObject.get("url");
            String database = (String) jsonObject.get("database");
            String port = (String) jsonObject.get("port");
            c = new ConnectionBean(url, port, database, password, username);
            //return "jdbc:mysql://" + url + ":" + port + "/" + database + "-" + username + "-" + password;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void setStringConnection(ConnectionBean c) throws IOException {
        ConnectionBean teste = new ConnectionBean(
                c.getUrl(),
                c.getPort(),
                c.getDatabase(),
                c.getPassword(),
                c.getUsername());
        
        JSONObject obj = new JSONObject();
        obj.put("username", c.getUsername());
        obj.put("password", c.getPassword());
        obj.put("url", c.getUrl());
        obj.put("database", c.getDatabase());
        obj.put("port", c.getPort());

        // try-with-resources statement based on post comment below :)
        try (FileWriter file = new FileWriter("config/config.json")) {
            file.write(obj.toJSONString());
        }
    }
}
