package com.bdg.osahakyan.bankaccountsystem.enums;

public enum Country {

    //source--> https://www.nationsonline.org/oneworld/country_code_list.htm

    AM("Armenia","051"),
    USA("United States of America","840"),
    CHN("China","156");

    private String countryName;
    private String numericCode;

    Country(String countryName, String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }
}
