package com.bdg.osahakyan.designpattern.abstractfactorypattern;

import com.bdg.osahakyan.designpattern.factorypattern.Shape;

public abstract class AbstractFactory {

      abstract Shape getShape(String shapeType);
}
