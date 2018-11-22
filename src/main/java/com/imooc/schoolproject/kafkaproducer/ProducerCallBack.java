package com.imooc.schoolproject.kafkaproducer;

import com.google.gson.Gson;
import com.imooc.schoolproject.common.MessageEntity;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFutureCallback;

import javax.validation.constraints.NotNull;

/**
 * @Author zhangliwei
 * @Date 2018/10/19 下午6:41
 */
public class ProducerCallBack implements ListenableFutureCallback<SendResult<String, MessageEntity>>{

    private static final Logger logger = LoggerFactory.getLogger(ProducerCallBack.class);

    private final long startTime;
    private final String key;
    private final MessageEntity message;

    private final Gson json = new Gson();

    public ProducerCallBack(long startTime, String key, MessageEntity message) {
        this.startTime = startTime;
        this.key = key;
        this.message = message;
    }


    @Override
    public void onFailure(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onSuccess(@NotNull SendResult<String, MessageEntity> sendResult) {
        if (null == sendResult){
            return;
        }
        long elapsedTime = System.currentTimeMillis() - startTime;
        RecordMetadata metadata = sendResult.getRecordMetadata();
        if (null != metadata){
            StringBuilder record = new StringBuilder();
            record.append("message(")
                    .append("key = ").append(key).append(",")
                    .append("message = ").append(json.toJson(message)).append(")")
                    .append("sent to partition(").append(metadata.partition()).append(")")
                    .append("with offset(").append(metadata.offset()).append(")")
                    .append("in ").append(elapsedTime).append(" ms");
            logger.info(record.toString());
        }
    }
}
