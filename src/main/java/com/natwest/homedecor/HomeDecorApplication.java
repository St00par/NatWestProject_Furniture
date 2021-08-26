package com.natwest.homedecor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.natwest.homedecor.jdbc.jdbcConnector;
import com.natwest.homedecor.jdbc.jdbcUtilities;

@SpringBootApplication
public class HomeDecorApplication {

public static void main(String[] args) {
	SpringApplication.run(HomeDecorApplication.class, args);
	
	jdbcConnector dbConn = new jdbcConnector("admin", "sofaroot");
	jdbcUtilities dbUtils = new jdbcUtilities();
	String query = "INSERT INTO furniture_domain VALUES(5, 99.99, 'Mahogany', 'Side Table')";
	dbUtils.exUpdate(query); 
//	String query = "SELECT * FROM furniture_domain";
	
	
	}
}
