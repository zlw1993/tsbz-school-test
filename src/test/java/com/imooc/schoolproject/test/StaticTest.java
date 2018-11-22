package com.imooc.schoolproject.test;

/**
 * @Author zhangliwei
 * @Date 2018/11/13 上午11:48
 */
public class StaticTest {

    private static String a = "123";

    static {
        System.out.println("static init");
    }

    public StaticTest() {
        System.out.println("constractor init");
    }

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        a = "321";
        System.out.println("main init" + a);
    }

    public static void saySomething(String someThing){
        System.out.println("say : " + someThing);
    }
}
