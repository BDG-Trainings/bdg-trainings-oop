package bankaccountsystem.objects;

import bankaccountsystem.entity.AbstractBASEntity;
import bankaccountsystem.enums.CountryCode;
import bankaccountsystem.enums.PhoneType;

public class PhoneNumber extends AbstractBASEntity {

    private CountryCode countryCode;
    private String number;
    private PhoneType phoneType;

    public PhoneNumber(CountryCode countryCode, String number, PhoneType phoneType) {
        this.countryCode = countryCode;
        this.number = number;
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", number='" + number + '\'' +
                ", phoneType=" + phoneType +
                '}';
    }
}
