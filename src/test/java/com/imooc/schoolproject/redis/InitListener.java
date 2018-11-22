package com.imooc.schoolproject.redis;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author zhangliwei
 * @Date 2018/11/13 下午3:32
 */
public class InitListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("=============init===============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
