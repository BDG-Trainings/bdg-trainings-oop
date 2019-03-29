package com.bdg.master.patterns;


import java.util.Map;

public final class RenderRequest {

    private Map<String, String> parameters;
    private RenderObjectType renderObjectType;


    public RenderRequest(Map<String, String> parameters, RenderObjectType renderObjectType) {
        this.parameters = parameters;
        this.renderObjectType = renderObjectType;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public RenderObjectType getRenderObjectType() {
        return renderObjectType;
    }
}
