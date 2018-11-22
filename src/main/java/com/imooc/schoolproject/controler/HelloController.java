package com.imooc.schoolproject.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangliwei
 * @Date 2018/9/1 下午10:59
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/sayHi")
    @ResponseBody
    public String sayHi(){

        return "Hello Spring Boot";
    }
}
