package com.lizq.design.creational.singleton;

/**
 * @author lizq
 * @date 2019/01/15 22:18
 */
public class LazyDoubleCheckLockSingleton {
    private volatile static LazyDoubleCheckLockSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckLockSingleton() {

    }

    public static LazyDoubleCheckLockSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckLockSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckLockSingleton();
                    //1.分配内存给这个对象
//                  //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //2.初始化对象
//                    intra-thread semantics
//                    ---------------//3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
