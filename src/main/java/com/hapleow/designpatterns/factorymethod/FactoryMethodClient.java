package com.hapleow.designpatterns.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 工厂方法模式客户端
 */
public class FactoryMethodClient {

    Logger logger = LoggerFactory.getLogger(FactoryMethodClient.class);

    public static void main(String[] args) {

        /**
         * 画一个圆形
         */
        ShapeFactory factory = new CircleFactory();
        factory.getShape().draw();

        /**
         * 画一个正方形
         */
        factory = new SquareFactory();
        factory.getShape().draw();

        /**
         * 画一个三角形
         */
        factory = new TriangleFactory();
        factory.getShape().draw();
    }
}
