package com.hapleow.designpatterns.factorymethod;

/**
 * 三角形工厂
 */
public class TriangleFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Triangle();
    }
}
