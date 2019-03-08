package com.bdg.master.interfaces;


public class Application {

    public static void main(String[] args) {

        OracleDatabaseConnector oracleDatabaseConnector = new OracleDatabaseConnector();

        MySqlDatabaseConnector mySqlDatabaseConnector = new MySqlDatabaseConnector();

        DatabaseConnector[] connectors = {oracleDatabaseConnector, mySqlDatabaseConnector};

        for (DatabaseConnector c : connectors) {
            c.openConnection();
        }



        PersonService personService = new PersonService(oracleDatabaseConnector);


    }
}
