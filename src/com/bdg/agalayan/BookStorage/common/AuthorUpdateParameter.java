package com.bdg.agalayan.BookStorage.common;

public class AuthorUpdateParameter {

        private int id;
        private String surname;
        private String name;

        public AuthorUpdateParameter(int id, String surname, String name){
            this.id=id;
            this.name=name;
            this.surname=surname;

        }

        public String getName() {
            return name;
        }
        public String getSurname() {
            return surname;
        }
         public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}


