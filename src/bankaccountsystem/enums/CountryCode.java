package bankaccountsystem.enums;

public enum  CountryCode {

//source--> https://countrycode.org/

    AM("+374", Country.AM),
    USA("+1", Country.USA),
    CHN("+86", Country.CHN);

    private String countryCode;
    private Country country;

    CountryCode(String countryCode, Country country) {
        this.countryCode = countryCode;
        this.country = country;
    }
}
