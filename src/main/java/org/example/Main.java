package org.example;

import org.example.auth.AccountManager;
import org.example.database.DatabaseConnection;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        DatabaseConnection dbconnection = new DatabaseConnection();
        dbconnection.connect("database.db");

        AccountManager accountManager = new AccountManager(dbconnection);

        accountManager.register("test","211234");

        dbconnection.disconnect();
    }
}