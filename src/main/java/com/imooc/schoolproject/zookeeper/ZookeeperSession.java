package com.imooc.schoolproject.zookeeper;

/**
 * @Author zhangliwei
 * @Date 2018/11/20 下午8:22
 * 单例模式获取zookeeper
 */
public class ZookeeperSession {

    public static class Singleton{
        
        private static ZookeeperSession singleton;

        static {
            singleton = new ZookeeperSession();
        }

        public static ZookeeperSession getInstance(){
            return singleton;
        }
    }

    public static ZookeeperSession getZookeeperInstance(){
        return Singleton.getInstance();
    }

    public static void init(){
        getZookeeperInstance();
    }
}
