package com.imooc.schoolproject.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhangliwei
 * @Date 2018/10/19 下午4:48
 */
@Getter
@Setter
public class Response {

    private int code;

    private String message;

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
