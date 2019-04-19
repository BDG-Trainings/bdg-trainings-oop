/*
package com.bdg.master.patterns;


import com.bdg.master.patterns.proxy.LoggedRequestRendererProxy;

import java.util.EnumMap;
import java.util.Map;

public final class RendererFactory {


    private static final Map<RenderObjectType, RequestRenderer> renderInstanceHolder;

    static {
        renderInstanceHolder = new EnumMap<>(RenderObjectType.class);
        renderInstanceHolder.put(RenderObjectType.PDF, PDFRenderer.getInstance());
        renderInstanceHolder.put(RenderObjectType.XML, new LoggedRequestRendererProxy());
    }

    public static RequestRenderer getRenderer(RenderObjectType objectType) {
        return renderInstanceHolder.get(objectType);
    }
}
*/
