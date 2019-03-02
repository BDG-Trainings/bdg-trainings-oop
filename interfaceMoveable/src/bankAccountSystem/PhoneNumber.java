package bankAccountSystem;

import bankAccountSystem.enums.CountryCode;
import bankAccountSystem.enums.PhoneType;

public class PhoneNumber {
    private CountryCode countryCode,
    private String number;
    private PhoneType type;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType type) {
        this.countryCode = countryCode;
        this.number = number;
        this.type = type;
    }
}
