package com.ky.thread;

import java.util.concurrent.Callable;

/**
 * @ClassName a
 * @Author beyond
 * @Company KY
 * @Date 2018/12/4 11:00
 * @Descr 三种创建线程方式
 */
public class TestCall implements Callable {
    @Override
    public Object call() {
        //System.out.println("thread: " + Thread.currentThread().getId() + " is running!");
        return Thread.currentThread().getId();
    }
}
