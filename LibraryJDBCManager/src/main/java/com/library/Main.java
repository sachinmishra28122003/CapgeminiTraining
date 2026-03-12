package com.library;

import com.library.db.DatabaseConnection;

import java.sql.Connection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection con = DatabaseConnection.getConnection();
        if(con != null) {
            System.out.println("Connected");
        }
    }
}