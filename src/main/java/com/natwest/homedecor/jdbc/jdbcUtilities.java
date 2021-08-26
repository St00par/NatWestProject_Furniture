package com.natwest.homedecor.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcUtilities {

	public static void exUpdate(String query) {
    	try {
    		jdbcConnector.stmnt.executeUpdate(query);
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    }
    static ResultSet exQuery(String query) {
    	ResultSet response = null;
    	try {
    		response = jdbcConnector.stmnt.executeQuery(query);
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return response;
    }
}
