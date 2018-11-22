package com.imooc.schoolproject.kafkaconsumer;

import com.google.gson.Gson;
import com.imooc.schoolproject.common.MessageEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author zhangliwei
 * @Date 2018/10/19 下午6:22
 */
@Component
public class SimpleConsumer {

    private static final Logger logger = LoggerFactory.getLogger(SimpleConsumer.class);
    private final Gson json = new Gson();

    @KafkaListener(topics = "${kafka.topic.default}", containerFactory="kafkaListenerContainerFactory" )
    public void receive(MessageEntity messageEntity){
        logger.info(json.toJson(messageEntity));
    }
}
