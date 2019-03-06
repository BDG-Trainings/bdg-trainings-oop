package com.bdg.hhertevtsyan.bankaccountsystem.json;


public final class JsonParserResult {
private final String jsonKey;
private final String jsonValue;

public JsonParserResult (final String jsonKey, final String jsonValue) {
    this.jsonKey = jsonKey;
    this.jsonValue = jsonValue;
}

    public String getJsonKey() {
        return jsonKey;
    }

    public String getJsonValue() {
        return jsonValue;
    }
}
