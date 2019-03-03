package com.bdg.master.json.parser;


import com.bdg.master.json.validator.InvalidJsonException;
import com.bdg.master.json.validator.JsonContentValidator;
import com.bdg.master.json.validator.JsonValidator;

/**
 * SimpleJsonParser class.
 * Parsing simple string json content, without arrays and inner objects.
 */
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
    public JsonParseResults doParse(final String content) throws InvalidJsonException {

        this.validator.validate(content);

        final String withoutBrackets = removeBrackets(content);
        final String[] withoutComma = withoutBrackets.split(COMMA);

        final JsonParseResults results = new JsonParseResults(withoutComma.length, 10);

        for (final String str : withoutComma) {
            results.addResult(this.retriveSingleParseResult(str.split(TWO_DOTS)));
        }

        return results;
    }

    private String removeBrackets(final String content) {
        return content.replace(OPEN_BRACKETS, "").replace(CLOSE_BRACKETS, "");
    }

    private JsonParseResult retriveSingleParseResult(final String[] keyValueStr) {
        final String cleanKey = keyValueStr[KEY].replace("\n", "").replace("\"", "").trim();
        final String cleanValue = keyValueStr[VALUE].replace("\n", "").replace("\"", "").trim();
        return new JsonParseResult(cleanKey, cleanValue);
    }

    public static void main(String[] args) {
        final String simpleJson = "{\n" +
                "  \"countryCode\": \"ARM\",\n" +
                "  \"number\": \"091234567\",\n" +
                "  \"phoneType\": \"Mobile\"\n" +
                "}";

        JsonParser parser = new SimpleJsonParser();

        parser.doParse(simpleJson);
    }
}
