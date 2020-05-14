package com.hapleow.designpatterns.factorymethod;

/**
 * 正方形工厂
 */
public class SquareFactory implements ShapeFactory {

    @Override
    public Shape getShape() {
        return new Square();
    }
}
