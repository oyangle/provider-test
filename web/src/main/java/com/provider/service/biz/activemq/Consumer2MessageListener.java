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
public class Consumer2MessageListener implements MessageListener{

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer2MessageListener.class);

    @Override
    public void onMessage(Message message) {

        TextMessage textMessage = (TextMessage) message;
        try{
            LOGGER.info("中文 2 ："+textMessage.getText());
        }catch (JMSException e){
            e.printStackTrace();
        }

    }
}
