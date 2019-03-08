package com.bdg.aidaghalayan.interfaces;


public class MySqlDatabaseConnector implements DatabaseConnector {
    @Override
    public Connection openConnection() {
        System.out.println("Open MySql connection");
        return null;
    }

    @Override
    public boolean closeConnection() {
        return false;
    }

    public void doSomething() {

    }
}
