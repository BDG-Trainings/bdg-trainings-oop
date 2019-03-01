package com.bdg.spapoyan.bankAccountSystem.enumBankAccountSystem;

public enum CountyCode {

    ARM("+374", Country.AM),
    RUS("007", Country.RU),
    USA("001", Country.US);

    private final String countryCode;
    private final Country country;

    CountyCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }
}
