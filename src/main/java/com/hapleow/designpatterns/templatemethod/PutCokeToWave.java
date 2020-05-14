package com.hapleow.designpatterns.templatemethod;

/**
 * 大象放冰箱
 */
public class PutCokeToWave extends AbstractTemplate{

    @Override
    protected void openDoor() {
        System.out.println("open wave door.");
    }

    @Override
    protected void putIn() {
        System.out.println("put coke into wave.");
    }

    @Override
    protected void closeDoor() {
        System.out.println("close wave door.");
    }
}
