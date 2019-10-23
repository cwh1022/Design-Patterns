package com.study.singleton;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created on 2019/10/23
 *
 * @author connor.chen
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if (instance == null){
            return new Singleton();
        }
        return instance;
    }
}

/**
 *  线程安全，但是高并发性能不是很高
 */
class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {

    }

    public static synchronized Singleton1 getInstance() {

        if (instance == null) {

            instance = new Singleton1();
        }

        return instance;
    }
}

/**
 * 线程安全，性能又高
 */
class Singleton2 {

    private static Singleton2 instance;
    private static byte[] lock = new byte[0];

    private Singleton2() {

    }

    public static Singleton2 getInstance() {

        if (instance == null) {

            synchronized (lock) {
                instance = new Singleton2();
            }
        }

        return instance;
    }
}


/**
 * 线程安全，性能又高
 */
class Singleton3 {

    private static Singleton3 instance;
    private static ReentrantLock lock = new ReentrantLock();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {

        if (instance == null) {

            lock.lock();
            if (instance == null) {
                instance = new Singleton3();
            }
            lock.unlock();
        }

        return instance;
    }
}