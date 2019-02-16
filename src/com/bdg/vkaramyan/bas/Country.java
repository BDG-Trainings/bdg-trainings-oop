package com.bdg.vkaramyan.bas;

public enum Country {
	
	AF("Afghanistan", "004"),
    AM("Armenia", "051"),
    FR("France", "250"),
    IT("Italy", "380"),
    US("United States of America", "840");

    private final String countryName;
    private final String numericCode;

    Country(final String countryName, final String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getNumericCode() {
        return this.numericCode;
    }
    
  //Implement this functionality
    public static Country findByCountryName(final String countryName) {
    	Country [] countries = values();
    	for(int i = 0;  i < countries.length; i++) {
    		if (countries[i].getCountryName() == countryName) {
    			return countries[i];
    		}
    	}
        return null;
    }

    //Implement this functionality
    public static Country findByNumericCode(final String numericCode) {
    	Country[] countries = values();
    	for (int i = 0; i < countries.length; i++) {
    		if(countries[i].getNumericCode() == numericCode) {
    			return countries[i];
    		}
    	}
        
        return null;
    }

}
