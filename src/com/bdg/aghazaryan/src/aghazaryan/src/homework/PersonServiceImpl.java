package com.bdg.aghazaryan.src.aghazaryan.src.homework;

public class PersonServiceImpl implements PersonService  {

    @Override

    public Person create(final String firstName,final String middleName, final String lastName, final int age ){

        return new Person(firstName, lastName, middleName, age);
    }

}
