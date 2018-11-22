package com.redis.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author zhangliwei
 * @Date 2018/11/13 下午3:39
 * 单例的实现有很多种
 * 静态内部类的方式，绝对线程安全的
 */
public class RequestProcessThreadPool {

    private ExecutorService threadPool = Executors.newFixedThreadPool(10);
    /**
     * 内存队列
     */
    private List<ArrayBlockingQueue<Request>> queues = new ArrayList<>();

    public RequestProcessThreadPool() {
        for (int i = 0; i < 10; i++) {
            ArrayBlockingQueue<Request> arrayBlockingQueue = new ArrayBlockingQueue<>(100);
            queues.add(arrayBlockingQueue);
            threadPool.submit(new WorkerThread(queues));

        }
    }

    /**
     * 单例的实现有很多种
     * 静态内部类的方式，绝对线程安全的
     */
    private static class Singleton{

        private static RequestProcessThreadPool instance;

        static {
            instance = new RequestProcessThreadPool();
        }

        public static RequestProcessThreadPool getInstance(){

            return instance;
        }
    }

    /**
     * jvm的机制去保证多线程并发安全
     * 静态内部类的方式，去初始化单例
     * @return
     */
    public static RequestProcessThreadPool getInstance(){
        return Singleton.getInstance();
    }

    public void init(){
        getInstance();
    }

}
