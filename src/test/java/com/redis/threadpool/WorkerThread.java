package com.redis.threadpool;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;

/**
 * @Author zhangliwei
 * @Date 2018/11/13 下午3:58
 * 执行请求的工作线程
 */
public class WorkerThread implements Callable{

    private List<ArrayBlockingQueue<Request>> queues;

    public WorkerThread(List<ArrayBlockingQueue<Request>> queues) {
        this.queues = queues;
    }

    @Override
    public Boolean call() throws Exception {
        while (true){
            break;
        }
        return true;
    }

}
