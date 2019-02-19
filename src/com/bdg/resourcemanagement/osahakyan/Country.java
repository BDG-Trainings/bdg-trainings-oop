package com.bdg.resourcemanagement.osahakyan;

public enum  Country {

        AM("Armenia", "Yerevan"),
        CN("China", "Beijing"),
        ES("Spain", "Madrid");

        private final String countryName;
        private final String city;

        Country(final String countryName, final String city) {
            this.countryName = countryName;
            this.city = city;
        }

        public String getCountryName() {
            return this.countryName;
        }

        public String getCity() {
            return this.city;
        }

        @Override
    public String toString(){
            return "Country ( " +
                    "CountryName: " + countryName +
                    ", City: " + city +
                    ")";
    }
}

