package com.bdg.master.json.parser;


import com.bdg.master.json.validator.InvalidJsonException;

public class JsonArrayParserImpl implements JsonArrayParser {


    private static final char OPEN_ARRAY_BRACKETS = '[';
    private static final char CLOSE_ARRAY_BRACKETS = ']';
    private static final char OPEN_BRACKETS = '{';
    private static final char CLOSE_BRACKETS = '}';

    @Override
    public String[] doParse(final String content) throws InvalidJsonException {

        int openIndex = content.indexOf(OPEN_ARRAY_BRACKETS);
        int closeIndex = content.indexOf(CLOSE_ARRAY_BRACKETS);

        String arrayContent = content.subSequence(openIndex, closeIndex).toString();

        String withoutArrayBrackets = arrayContent.replace(OPEN_ARRAY_BRACKETS, ' ').replace(CLOSE_ARRAY_BRACKETS, ' ').trim();

        int innerObjectCount = withoutArrayBrackets.split("},").length;

        final String[] strObjectResults = new String[innerObjectCount];
        int k = 0;
        int tmpOpenIndex = -1;
        int tmpCloseIndex = -1;
        for (int i = 0; i < withoutArrayBrackets.length(); i++) {
            if (withoutArrayBrackets.charAt(i) == OPEN_BRACKETS) {
                tmpOpenIndex = i;
            }
            if (withoutArrayBrackets.charAt(i) == CLOSE_BRACKETS) {
                tmpCloseIndex = i;
            }

            if (tmpOpenIndex != -1 && tmpCloseIndex != -1 && tmpCloseIndex > tmpOpenIndex) {
                strObjectResults[k] = withoutArrayBrackets.subSequence(tmpOpenIndex, tmpCloseIndex + 1).toString();
                k++;
                tmpOpenIndex = -1;
                if (tmpCloseIndex + 1 != withoutArrayBrackets.length()) {
                    i = tmpCloseIndex;
                }
            }
        }
        return strObjectResults;
    }
}
