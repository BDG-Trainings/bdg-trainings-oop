package com.bdg.osahakyan.designpattern.abstractfactorypattern;

import com.bdg.osahakyan.designpattern.factorypattern.Shape;

public class RoundedShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RoundedRectangle")) return new RoundedRectangle();
        if(shapeType.equalsIgnoreCase("RoundedSquare")) return new RoundedSquare();

        return null;
    }
}
