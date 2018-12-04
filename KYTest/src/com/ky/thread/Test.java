package com.ky.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @ClassName a
 * @Author beyond
 * @Company KY
 * @Date 2018/12/4 11:00
 * @Descr 三种创建线程方式
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Test t = new Test();
        t.one();
        t.two();
        t.three();
    }

    public void one(){
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("thread:" + Thread.currentThread().getId() + " is running!");
            }
        }).start();
    }

    public void two(){
        new Thread(new TestRun()).start();
    }

    public void three() throws Exception{
        ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask<String> future = new FutureTask<String>(new TestCall());
        executor.submit(future);
        System.out.println("thread: " + String.valueOf(future.get()) + "is running!");
    }
}
