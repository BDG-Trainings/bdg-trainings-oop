package com.bdg.master.patterns;


import java.util.Map;

public interface RequestRenderer {

    String render(Map<String, String> params);
}
