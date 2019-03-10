package com.bdg.aidaghalayan;

import com.bdg.aidaghalayan.json.parser.*;
import com.bdg.aidaghalayan.json.validator.InvalidJsonException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Thumbnail {

    private JsonParser jsonParser = new SimpleJsonParser();
    private JsonParseResult jsonParseResult;
    private String content;



    public static void main(String[] args) {
        String content="{\n"+
	"\"id\": \"0001\","+
	"\"type\": \"donut\","+
	"\"name\": \"Cake\","+
	"\"image\":"+
        "{"+
			"\"url\": \"images/0001.jpg\","+
			"\"width\": 200,"+
			"\"height\": 200"+
       "}," +
           "\\\"thumbnail\\\":" +
        "{"+
			"\"url\": \"images/thumbnails/0001.jpg\","+
			"\"width\": 32,"+
			"\"height\": 32"+
       " }"+
   " }";
        JsonParseResults jsonParseResults= new JsonParseResults();
        SimpleJsonParser jsonParser=  new SimpleJsonParser();

        System.out.print(jsonParser.doParse(content));
    }
}
