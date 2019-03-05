package com.bdg.aiskandaryan.Lesson_111.Entities;

public enum Country {
    AM("Armenia","051"), US("United States", "111"), RU("Russian Federation", "004");

    Country(final String countryName, final String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getNumericCode() {
        return numericCode;
    }

    private final String countryName;
    private final String numericCode;
}
