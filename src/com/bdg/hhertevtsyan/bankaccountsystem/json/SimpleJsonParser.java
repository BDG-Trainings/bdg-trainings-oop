package com.bdg.hhertevtsyan.bankaccountsystem.json;

import com.bdg.hhertevtsyan.bankaccountsystem.json.validator.InvalidJsonException;
import com.bdg.hhertevtsyan.bankaccountsystem.json.validator.JsonContentValidator;
import com.bdg.hhertevtsyan.bankaccountsystem.json.validator.JsonValidator;

public final class SimpleJsonParser implements JsonParser {


    private static final String OPEN_BRACKETS = "{";
    private static final String CLOSE_BRACKETS = "}";
    private static final String TWO_DOTS = ":";
    private static final String COMMA = ",";

    private static final int KEY = 0;
    private static final int VALUE = 1;

    private final JsonValidator validator = new JsonContentValidator();

    /**
     * @param content json string representation.
     * @return JsonParseResults which contains key and value from json content.
     */
    @Override
    public JsonParserResults doParse(final String content) throws InvalidJsonException {

        this.validator.validate(content);

        final String withoutBrackets = removeBrackets(content);
        final String[] withoutComma = withoutBrackets.split(COMMA);

        final JsonParserResults results = new JsonParserResults(withoutComma.length, 10);

        for (final String str : withoutComma) {
            results.addResult(this.retriveSingleParseResult(str.split(TWO_DOTS)));
        }

        return results;
    }

    private String removeBrackets(final String content) {
        return content.replace(OPEN_BRACKETS, "").replace(CLOSE_BRACKETS, "");
    }

    private JsonParserResult retriveSingleParseResult(final String[] keyValueStr) {
        final String cleanKey = keyValueStr[KEY].replace("\n", "").replace("\"", "").trim();
        final String cleanValue = keyValueStr[VALUE].replace("\n", "").replace("\"", "").trim();
        return new JsonParserResult(cleanKey, cleanValue);
    }

    public static void main(String[] args) {
        final String simpleJson = "{\n" +
                "  \"countryCode\": \"ARM\",\n" +
                "  \"number\": \"091234567\",\n" +
                "  \"phoneType\": \"Mobile\"\n" +
                "}";

        JsonParser parser = new SimpleJsonParser();

       JsonParserResults jsonParserResults = parser.doParse(simpleJson);
        String [] string = new String[jsonParserResults.length()];
        for (int i =0; i<string.length; i++) {
            string[i] = jsonParserResults.getResults()[i].getJsonValue();
            System.out.println(string[i]);
        }
    }
}
