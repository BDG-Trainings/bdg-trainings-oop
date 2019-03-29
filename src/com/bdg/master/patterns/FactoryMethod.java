package com.bdg.master.patterns;


import java.util.HashMap;

public class FactoryMethod {

    public static void main(String[] args) {

        RenderRequest renderRequest = new RenderRequest(new HashMap<String, String>() {{
        }}, RenderObjectType.PDF);

        RequestRenderer renderer = RendererFactory.getRenderer(renderRequest.getRenderObjectType());

        if (renderer != null) {
            String render = renderer.render(renderRequest.getParameters());
        }
    }
}
