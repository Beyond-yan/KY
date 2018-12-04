package com.ky.thread;

/**
 * @ClassName a
 * @Author beyond
 * @Company KY
 * @Date 2018/12/4 11:00
 * @Descr 三种创建线程方式
 */
public class TestRun implements Runnable{
    @Override
    public void run() {
        System.out.println("thread: " +  Thread.currentThread().getId() + " is running!");
    }
}