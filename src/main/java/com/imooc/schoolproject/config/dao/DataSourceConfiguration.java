package com.imooc.schoolproject.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * @Author zhangliwei
 * @Date 2018/9/2 上午10:10
 */
@Configuration
@MapperScan("com.imooc.schoolproject.dao")
public class DataSourceConfiguration {

    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUsername;
    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Bean(name = "dataSource")
    public ComboPooledDataSource createDateSource() throws PropertyVetoException{
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(jdbcDriver);
        comboPooledDataSource.setJdbcUrl(jdbcUrl);
        comboPooledDataSource.setUser(jdbcUsername);
        comboPooledDataSource.setPassword(jdbcPassword);
        // 关闭连接不自动提交事务
        comboPooledDataSource.setAutoCommitOnClose(false);
        return comboPooledDataSource;
    }



}
