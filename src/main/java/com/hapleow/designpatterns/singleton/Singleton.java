package com.hapleow.designpatterns.singleton;

/**
 * 单例模式
 * Double-Check Lock方式保证线程安全
 * 懒加载
 */
public class Singleton {

    /**
     * 这里必须使用volatile关键字修饰，来防止CPU指令重排序
     */
    private static volatile Singleton instance;

    private Singleton() {
    }

    /**
     * 获取实例方法
     * 双重检查锁配合volatile的禁止指令重排序，确保线程安全
     *
     * @return 实例
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
