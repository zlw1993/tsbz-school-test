package com.imooc.schoolproject.common;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author zhangliwei
 * @Date 2018/10/19 下午4:48
 */
@Getter
@Setter
@EqualsAndHashCode
public class MessageEntity {
    private String title;

    private String body;

    @Override
    public String toString() {
        return "Entity{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
