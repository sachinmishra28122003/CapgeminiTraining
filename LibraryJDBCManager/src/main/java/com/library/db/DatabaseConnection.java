package com.library.db;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String DATABASE_NAME = "library_jdbc_db";
    private static final String USER = "root";
    private static final String PASSWORD = "2003";

    private static final String DBURL = URL + DATABASE_NAME;

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection
                    (
                            URL,
                            USER,
                            PASSWORD
                    );

            System.out.println("Connected Successfully");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
