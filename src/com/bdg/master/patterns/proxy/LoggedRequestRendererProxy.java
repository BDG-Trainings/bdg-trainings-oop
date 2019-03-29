package com.bdg.master.patterns.proxy;


import com.bdg.master.patterns.RequestRenderer;
import com.bdg.master.patterns.XMLRenderer;

import java.util.Map;

public class LoggedRequestRendererProxy implements RequestRenderer {


    private RequestRenderer original;

    public LoggedRequestRendererProxy() {
        this.original = new XMLRenderer();
    }


    @Override
    public String render(Map<String, String> params) {
        System.out.println("LOGGED initial step");
        String render = this.original.render(params);
        System.out.println("LOGGED done!!!");
        return render;
    }
}
