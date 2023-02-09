package org.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection = null;

    static final String CONNECTION_USERNAME = "root";
    static final String CONNECTION_PASSWORD = "Genesis1947";
    static final String CONNECTION_HOST = "jdbc:mysql://localhost:3306/bank";

    private ConnectionFactory(){

    }

    public static Connection getConnection() throws SQLException {
        if (connection == null)
            connection = DriverManager.getConnection(CONNECTION_HOST, CONNECTION_USERNAME, CONNECTION_PASSWORD);
        return connection;
    }
}
