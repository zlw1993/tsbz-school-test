package com.imooc.schoolproject.config.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.util.StringUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Author zhangliwei
 * @Date 2018/9/4 下午1:19
 */
@Configuration
public class JspConfiguration {

    @Bean
    InternalResourceViewResolver internalResourceViewResolver () {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");

        return viewResolver;
    }
}
