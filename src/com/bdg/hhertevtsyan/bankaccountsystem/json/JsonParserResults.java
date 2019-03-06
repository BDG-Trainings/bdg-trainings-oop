package com.bdg.hhertevtsyan.bankaccountsystem.json;

public final class JsonParserResults {
    private JsonParserResult [] results;
    private int initialSize;
    private int currentSize =0;
    private int incrementalSize = 10;

    public JsonParserResults (final int initialSize) {
        this.initialSize = initialSize;
        this.results = new JsonParserResult[initialSize];
    }

    public JsonParserResults (final int initialSize, final int incrementalSize) {
        this.initialSize = initialSize;
        this.results = new JsonParserResult[initialSize];
        this.incrementalSize = incrementalSize;
    }

    public JsonParserResults () {
        this.initialSize = 10;
        this.results = new JsonParserResult[initialSize];
    }

    public JsonParserResults addResult (final JsonParserResult result) {
        if (this.currentSize < this.initialSize) {
            this.results[currentSize] = result;
            currentSize++;
        } else {
            final JsonParserResult[] replacement = new JsonParserResult[this.currentSize+this.incrementalSize];
            int index = 0;
            for (int k = 0; k < this.results.length; k++) {
                replacement[index] = this.results[k];
            }
            this.results = replacement;
        }
        return this;
    }

    public JsonParserResult[] getResults() {
        return results;
    }

    public int length() {
        return this.currentSize;
    }
}
