package com.bdg.hhakobyan;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

class TestDB {

    /*

      /usr/share/java

      http://dev.mysql.com/doc/connector-j/5.1/en/

      https://jdbc.postgresql.org/documentation/documentation.html

    */

    static Connection conn = null;

    public static void main(String[] args) {
        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;

        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/book_store", "root",
                    "root");

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

}