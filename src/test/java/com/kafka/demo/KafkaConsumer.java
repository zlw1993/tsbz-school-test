package com.kafka.demo;

import org.apache.kafka.clients.consumer.ConsumerConfig;

import java.util.Properties;

/**
 * @Author zhangliwei
 * @Date 2018/11/15 下午3:27
 */
public class KafkaConsumer implements Runnable{

    private  String topic ;

    public KafkaConsumer(String topic) {
        this.topic = topic;
        ConsumerConfig consumerConfig = KafkaConsumer.createConsumerConfig();
    }

    private static ConsumerConfig createConsumerConfig(){
        Properties properties = new Properties();
        properties.put("","");
        return null;
    }
    @Override
    public void run() {

    }
}
