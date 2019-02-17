package com.bdg.resourcemanagement.vqertikyan;

public enum Country {

    AM("Armenia", "Yerevan"),
    RU("Russia", "Moscow"),
    US("USA", "Washington");


   private final String countryName;
   private final String cityName;

   Country(final String countryName, final String cityName){
       this.countryName = countryName;
       this.cityName = cityName;
   }

    public String getCountryName() {
        return countryName;
    }

    public String getCityName() {
        return cityName;
    }
}
