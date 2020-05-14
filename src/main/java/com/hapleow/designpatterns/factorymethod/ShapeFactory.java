package com.hapleow.designpatterns.factorymethod;

/**
 * 工厂方法模式
 * 形状工厂接口，所有的形状工厂实现此接口
 */
public interface ShapeFactory {

    Shape getShape();
}
