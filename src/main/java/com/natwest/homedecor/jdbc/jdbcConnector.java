package com.natwest.homedecor.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcConnector {

	static final String DB_URL = "jdbc:mysql://furnituredatabase.ct5yfrsgs9vu.us-east-2.rds.amazonaws.com:3306/furniture";
    private String username;
    private String password;
    
    static Connection conn = null;
    static Statement stmnt = null;

    public jdbcConnector(String username, String password) {
    	this.username=username;
        this.password=password;
        try {
            conn = DriverManager.getConnection(DB_URL, username, password);
            stmnt = conn.createStatement();
            } catch (SQLException se) {
                se.printStackTrace();
            }
    }      
}

