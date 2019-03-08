package com.bdg.aidaghalayan.json.parser;


public final class JsonParseResult {

    private final String jsonKey;
    private final String jsonValue;

    public JsonParseResult(final String jsonKey, final String jsonValue) {
        this.jsonKey = jsonKey;
        this.jsonValue = jsonValue;
    }

    public String getJsonKey() {
        return this.jsonKey;
    }

    public String getJsonValue() {
        return this.jsonValue;
    }

    @Override
    public String toString() {
        return "JsonParseResult{" +
                "jsonKey='" + jsonKey + '\'' +
                ", jsonValue='" + jsonValue + '\'' +
                '}';
    }
}
