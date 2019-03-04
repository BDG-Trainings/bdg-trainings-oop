package com.bdg.aghazaryan.src.aghazaryan.src.bankaccountsystem.json.parser;

public final class JsonParseResults {

    private JsonParseResult[] results;
    private final int initialSize;
    private int currentSize = 0;
    private int incrementalSize = 10;

    public JsonParseResults(final int initialSize) {
        this.initialSize = initialSize;
        this.results = new JsonParseResult[this.initialSize];
    }

    public JsonParseResults(final int initialSize, final int incrementalSize) {
        this.initialSize = initialSize;
        this.results = new JsonParseResult[this.initialSize];
        this.incrementalSize = incrementalSize;
    }


    public JsonParseResults() {
        this.initialSize = 10;
        this.results = new JsonParseResult[this.initialSize];
    }

    public JsonParseResults addResult(final JsonParseResult result) {
        if (this.currentSize < this.initialSize) {
            this.results[currentSize] = result;
            currentSize++;
        } else {
            final JsonParseResult[] replacement = new JsonParseResult[this.currentSize + this.incrementalSize];

            int k = 0;
            for (final JsonParseResult jpr : this.results) {
                replacement[k] = jpr;
            }
            this.results = replacement;
        }
        return this;
    }

    public JsonParseResult[] getResults() {
        return this.results;
    }

    public int length() {
        return this.currentSize;
    }
}