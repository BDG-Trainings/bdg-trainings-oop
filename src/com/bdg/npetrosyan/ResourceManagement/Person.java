package com.bdg.npetrosyan.ResourceManagement;

    class Person {
        private String firstName;
        private String lastName;
        private String middleName;
        private short age;
        private Address[] addresses;

        public Person(final String firstName, final String lastName, final String middleName, final short age, final Address[] addresses) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.age = age;
            this.addresses = addresses;

        }
        public void setFirstName(final String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(final String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setMiddleName(final String middleName) {
            this.middleName = middleName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setAge(final short age) {
            this.age = age;
        }

        public short getAge() {
            return age;
        }

    }

