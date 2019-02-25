package com.bdg.agalayan.BookStorage.common;

public class AuthorCreateParameter {

        private String name;
        private String surname;
        private Gender gender;

        public AuthorCreateParameter(String name, String surname, Gender gender) {
            this.name = name;
            this.surname = surname;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
    public String toString(){
            return "AuthorCreateParameter["+
                    "name="+ name+
                    ", surname="+surname +
                    ", gender=" + gender + "]";
        }
    }

