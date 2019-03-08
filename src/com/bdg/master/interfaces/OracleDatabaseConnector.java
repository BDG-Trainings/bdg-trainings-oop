package com.bdg.master.interfaces;


public class OracleDatabaseConnector implements DatabaseConnector {
    @Override
    public Connection openConnection() {

        System.out.println("Open oracle connection");
        return null;
    }

    @Override
    public boolean closeConnection() {
        return false;
    }
}
