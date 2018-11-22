package com.imooc.schoolproject.config.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * @Author zhangliwei
 * @Date 2018/9/2 下午1:37
 * 事务控制
 */
@Configuration
@EnableTransactionManagement
public class TransactionManagmentConfiguration implements TransactionManagementConfigurer{

    @Autowired
    private DataSource dataSource;
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {

        return new DataSourceTransactionManager(dataSource);
    }
}
