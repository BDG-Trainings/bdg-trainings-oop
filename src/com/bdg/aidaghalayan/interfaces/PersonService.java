package com.bdg.aidaghalayan.interfaces;


public class PersonService {

    private DatabaseConnector connector;

    public PersonService(DatabaseConnector connector) {
        this.connector = connector;
    }


    public void store(Person person) {
        String sql = String.format("INSERT INTO person (name, age) VALUES (%s, %d)", person.name, person.age);
        this.connector.openConnection().insert(sql);
    }


}
