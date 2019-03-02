package bankAccountSystem.enums;

public enum Country {
    AM("Armenia","051"),

    USA("USA","840"),

    CHN("China","156");
    private String countryName;
    private String numericCode;

    country(String countryName, String numericCode) {
        this.countryName = countryName;
        this.numericCode = numericCode;
    }

}
