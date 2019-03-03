package com.bdg.master.json;


import com.bdg.master.json.validator.JsonContentValidator;
import com.bdg.master.json.validator.JsonValidator;

public final class JsonParser {


    public static void validate(final String jsonContent) {

        final JsonValidator jsonValidator = new JsonContentValidator();

        jsonValidator.validate(jsonContent);

    }

    public static void main(String[] args) {


        final String jsonContent = "{\n" +
                "  \"country\": \"AM\",\n" +
                "  \"street\": \"some street\",\n" +
                "  \"phoneNumbers\": [\n" +
                "    {\n" +
                "      \"countryCode\": \"ARM\",\n" +
                "      \"number\": \"091234567\",\n" +
                "      \"phoneType\": \"MOBILE\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"countryCode\": \"ARM\",\n" +
                "      \"number\": \"091234567\",\n" +
                "      \"phoneType\": \"WORK\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"countryCode\": \"ARM\",\n" +
                "      \"number\": \"091234567\",\n" +
                "      \"phoneType\": \"HOME\"\n" +
                "    }\n" +
                "  \n" +
                "}";

        final String simpleJson = "{\n" +
                "  \"countryCode\": \"ARM\",\n" +
                "  \"number\": \"091234567\",\n" +
                "  \"phoneType\": \"Mobile\"\n" +
                "}";

        validate(simpleJson);
    }
}
