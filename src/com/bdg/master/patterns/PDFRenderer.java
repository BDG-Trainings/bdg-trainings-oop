package com.bdg.master.patterns;


import java.util.Map;

public final class PDFRenderer implements RequestRenderer {

    private static final RequestRenderer instance = new PDFRenderer();

    private PDFRenderer() {
    }

    @Override
    public String render(Map<String, String> params) {
        return null;
    }

    public static RequestRenderer getInstance() {
        return instance;
    }
}
