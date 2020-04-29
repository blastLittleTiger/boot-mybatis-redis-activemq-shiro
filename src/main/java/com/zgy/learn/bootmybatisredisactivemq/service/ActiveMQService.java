package com.zgy.learn.bootmybatisredisactivemq.service;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

@Service
public class ActiveMQService {
    @Autowired
    JmsMessagingTemplate template;

    // static Destination destination;

    // 发布订阅的模式
    //    public Destination createTopic(String name) {
    //        // 这块会有点问题
    //        destination = new ActiveMQQueue(name);
    //        return destination;
    //    }

    public String sendMessage(String message){
        template.convertAndSend("testQueue1", message);
        return "send okay!";
    }

    //    @JmsListener(destination = "test")
    public String receiveMessage(){
        Message<?> message = template.receive("testQueue1");
        return "receive okay!";
    }
}
