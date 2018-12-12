package com.provider.service.biz.activemq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * programname: provider_test
 * <p>
 * title: 消息监听者
 *
 * @author: yishao
 * <p>
 * created: 2018-12-12 11:44
 **/
@Service
public class ConsumerMessageListener implements MessageListener{

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerMessageListener.class);

    private static int count = 1;

    @Override
    public void onMessage(Message message) {

        TextMessage textMessage = (TextMessage) message;

        try {
            if(textMessage.getText().equals("中文0")){
                LOGGER.info("测试成功");
            }else {
                LOGGER.info("发送内容 ："+textMessage.getText());
            }
        }catch (JMSException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            throw e;
        }

    }
}
