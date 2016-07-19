/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unifil.javaconnection.misc;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

/**
 *
 * @author Guidetti
 */
public class JSONFileWriteExample {

    public static void main(String[] args) throws IOException {
// "username": "root",
//    "password": "root",
//    "url": "localhost",
//    "database": "laboratorio3",
//    "port": "3306"
        JSONObject obj = new JSONObject();
        obj.put("username", "root22");
        obj.put("password", "root22");
        obj.put("url", "localhost");
        obj.put("database", "laboratorio3");
        obj.put("port", "3306");

        // try-with-resources statement based on post comment below :)
        try (FileWriter file = new FileWriter("config/config.json")) {
            file.write(obj.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + obj);
        }
    }

}
