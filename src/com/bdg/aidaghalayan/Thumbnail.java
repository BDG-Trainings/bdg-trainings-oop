package com.bdg.aidaghalayan;

import com.bdg.aidaghalayan.json.parser.*;

public class Thumbnail {

    private JsonParser jsonParser = new SimpleJsonParser();
    private JsonParseResult jsonParseResult;
    private String content;



    public String create(String content){
        JsonParseResults results= jsonParser.doParse(content);
        for(JsonParseResult jsonParseResult:results.getResults()){
            if(jsonParseResult.getJsonKey()=="id"){
                 jsonParseResult.getJsonValue();
            }
            if (jsonParseResult.getJsonKey() == "type") {

                jsonParseResult.getJsonValue();
            }
            if(jsonParseResult.getJsonKey() == "name"){
                jsonParseResult.getJsonValue();
            }
            if (jsonParseResult.getJsonKey() == "image") {
                jsonParseResult.getJsonValue();
            }
        }
        return content;
    }
    public static void main(String[] args) {
        String content="{\n"+
	"\"id\": \"0001\",\n"+
	"\"type\": \"donut\",\n"+
	"\"name\": \"Cake\",\n"+
	"\"image\":\n"+
        "{\n"+
			"\"url\": \"images/0001.jpg\",\n"+
			"\"width\": 200\",\n"+
			"\"height\": 200\n"+
       "}\n," +
           "\\\"thumbnail\\\":" +
        "{\n"+
			"\"url\": \"images/thumbnails/0001.jpg\",\n"+
			"\"width\": 32\n,\n"+
			"\"height\": 32\n"+
       " }\n"+
   " }\n";

        Thumbnail t= new Thumbnail();
        System.out.print(t.create(content));
    }
}
