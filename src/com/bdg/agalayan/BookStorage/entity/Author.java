package com.bdg.agalayan.BookStorage.entity;

import com.bdg.agalayan.BookStorage.common.Gender;

public class Author {
        private String name;
        private String surname;
        private Gender gender;
        private int id;

        public Author(int id, String name, String surname, Gender gender) {
            this.id=id;
            this.name = name;
            this.surname = surname;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public Gender getGender() {
            return gender;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Deprecated
    public String toString(){
            return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
            }

    }


