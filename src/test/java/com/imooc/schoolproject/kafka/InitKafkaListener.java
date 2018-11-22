package com.imooc.schoolproject.kafka;

import com.kafka.demo.KafkaConsumer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author zhangliwei
 * @Date 2018/11/15 下午3:24
 */

public class InitKafkaListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String sss = "{\"neme\":\"zhngsan\"}";

        System.out.println("=============kafka init=============");
        new Thread(new KafkaConsumer("test")).start();

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
