package com.nebrija.pookemon.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static final String jdbcURL = "jdbc:mysql://192.168.1.80:3306/pookemon";
    private static Connection jdbcConnection;

    private DBConnection(){}

    public static Connection getConnection() throws SQLException { //Singleton

        if (jdbcConnection == null || jdbcConnection.isClosed()){
            Properties props = new Properties();
            props.put("user", "root");
            props.put("password", "root");
            jdbcConnection = DriverManager.getConnection(jdbcURL, props);
        }
        return jdbcConnection;
    }

    public void desconectarse() throws SQLException {
        if (jdbcConnection !=null && !jdbcConnection.isClosed()){

            try {
                jdbcConnection.close();
            } catch (SQLException e) {
                throw new SQLException(e);
            }
        }
    }

    public Connection getJdbcConnection(){
        return jdbcConnection;
    }

}
