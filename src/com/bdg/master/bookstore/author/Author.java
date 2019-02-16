package com.bdg.master.bookstore.author;


public final class Author {

    private int id;
    private String name;
    private String surname;
    private String gender;

    public Author(final String name, final String surname, final String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public void setId(final int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
