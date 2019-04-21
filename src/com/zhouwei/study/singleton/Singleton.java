package com.zhouwei.study.singleton;

/**
 * 懒汉式的经典单例
 * 使用静态内部类实现
 * @author zhouwei
 * @create 2019-04-20
 */
public class Singleton {

    private static class LazyLoader{
        private static final Singleton INSTANCE = new Singleton();
    }

    //默认构造私有，避免外部方法可以使用默认构造随时new出来
    private Singleton(){}

    public static final Singleton getInstance(){
        return LazyLoader.INSTANCE;
    }
}
