package com.bdg.aidaghalayan.interfaces;


public class MySQLConnector implements DatabaseConnector, FileSystemConnector {


    @Override
    public Connection openConnection() {
        System.out.println("Connecting to database ");
        return null;
    }

    @Override
    public boolean closeConnection() {
        return false;
    }

    @Override
    public Connection getFileSystemConnector() {
        System.out.println("Connecting to file system");
        return null;
    }
}
