package com.bdg.osahakyan.bas;

public enum Country {

    AM("Yerevan", "Armenia"),
    US("Chicago", "USA");

    private final String city;
    private final String country;

    Country(final String city, final String country){
        this.city = city;
        this.country = country;
    }

    public String getCity(){return city;}
    public String getCountry(){return country;}

    public static Country findCountryByCity(final String city){
        for(Country cnt: Country.values()){
            if(cnt.city.equals(city)){
                return cnt;
            }
        }
        return null;
    }

    public static Country findCountryByCountry(final String country){
        for(Country cnt: Country.values()){
            if(cnt.country.equals(country)){
                return cnt;
            }
        }
        return null;
    }

}

