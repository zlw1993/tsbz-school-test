package com.imooc.schoolproject.controler;

import com.google.gson.Gson;
import com.imooc.schoolproject.common.ErrorCode;
import com.imooc.schoolproject.common.MessageEntity;
import com.imooc.schoolproject.common.Response;
import com.imooc.schoolproject.kafkaproducer.SimpleProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangliwei
 * @Date 2018/10/19 下午7:03
 */
@RestController
@RequestMapping("/kafka")
public class ProduceController {
    private static final Logger logger = LoggerFactory.getLogger(ProduceController.class);

    @Autowired
    private SimpleProducer simpleProducer;

    @Value("${kafka.topic.default}")
    private String topic;

    private Gson json = new Gson();

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = {"application/json"})
    public Response sendKafka(){
        return new Response(ErrorCode.SUCCESS, "OK");
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST, produces = {"application/json"})
    public Response sendKafka(@RequestBody MessageEntity message) {
        try {
            logger.info("kafka的消息={}", json.toJson(message));
            simpleProducer.send(topic, "key", message);
            logger.info("发送kafka成功.");
            return new Response(ErrorCode.SUCCESS, "发送kafka成功");
        } catch (Exception e) {
            logger.error("发送kafka失败", e);
            return new Response(ErrorCode.EXCEPTION, "发送kafka失败");
        }
    }


}
