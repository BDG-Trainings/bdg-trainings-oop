package com.bdg.hhertevtsyan.abstraction.personandsubclasses;

public abstract class Human {
    protected String gender;
    protected String nationality;
    protected short age;

    public Human () {}
    public Human (final String gender, final String nationality, final short age) {
        this.gender = gender;
        this.nationality = nationality;
        this.age = age;
    }

    public abstract void setGender (final String gender);
    public abstract void setNationality (final String nationality);
    public abstract void setAge(final short age);

    public abstract String getGender();
    public abstract String getNationality();
    public abstract short getAge();

    public abstract String toString();

}
