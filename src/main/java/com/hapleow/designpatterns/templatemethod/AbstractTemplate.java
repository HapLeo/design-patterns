package com.hapleow.designpatterns.templatemethod;

/**
 * 模板方法模式
 * 使用场景： 多个操作使用相同的流程
 * 关键思想：将通用的固定的调用流程抽取到父类中作为模板方法，且不可修改
 * 案例： 大象放冰箱里：开门 -> 放入大象 -> 关门，可乐放微波炉里：开门 -> 放入可乐 -> 关门；
 * 多个场景的操作步骤及顺序相同时，可考虑使用模板方法模式
 */
public abstract class AbstractTemplate {

    protected abstract void openDoor();

    protected abstract void putIn();

    protected abstract void closeDoor();

    /**
     * 模板方法，所有子类的共通执行流程
     * 使用final修饰，不可重写
     */
    public final void execute(){

        openDoor();
        putIn();;
        closeDoor();
    }
}
