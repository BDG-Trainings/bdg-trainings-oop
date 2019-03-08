package com.bdg.aidaghalayan.interfaces;


public interface DatabaseConnector {

    final int connectionMaxSize = 10;

    Connection openConnection();

    boolean closeConnection();
}
