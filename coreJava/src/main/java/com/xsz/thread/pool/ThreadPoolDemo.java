package com.xsz.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用线程池中线程对象的步骤：
 * 1. 创建线程池对象。
 * 2. 创建Runnable接口子类对象。(task)
 * 3. 提交Runnable接口子类对象。(take task)
 * 4. 关闭线程池(一般不做)。
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //创建线程池对象
    ExecutorService service= Executors.newFixedThreadPool(2);//包含2个线程对象
    //创建Runnable实例对象
    MyRunnable r=new MyRunnable();
    //自己创建线程对象的方式
    //Thread t=new Thread(r);
    //t.start();‐‐‐>调用MyRunnable中的run()
    //从线程池中获取线程对象,然后调用MyRunnable中的run()
    service.submit(r);
    //再获取个线程对象，调用MyRunnable中的run()
    service.submit(r);
    service.submit(r);
    //注意：submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭。
    //将使用完的线程又归还到了线程池中
    //关闭线程池
    //service.shutdown();
    }
}
