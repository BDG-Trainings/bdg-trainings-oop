package com.bdg.resourcemanagement.osahakyan;

import java.util.Arrays;

public final class Person {

        private final String firstName;
        private final String lastName;
        private final String middleName;
        private final short age;
        private final Address[] addresses;

        public Person(final String firstName, final String lastName, final String middleName, final short age, final Address[] addresses) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.age = age;
            this.addresses = addresses;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public short getAge() {
            return age;
        }

        public Address[] getAddresses() {
            return addresses;
        }

        @Override
        public String toString() {
            return "Person(" +
                    "FirstName: " + firstName + "," +
                    "MiddleName: " + middleName + "," +
                    "LastName: " + lastName + "," +
                    "Age: " + age + "," +
                    "Address" + Arrays.toString(addresses) +
                    ")";
        }
}
