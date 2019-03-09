package com.bdg.master.interfaces;


public interface DatabaseConnector {

    final int connectionMaxSize = 10;

    Connection openConnection();

    boolean closeConnection();
}
