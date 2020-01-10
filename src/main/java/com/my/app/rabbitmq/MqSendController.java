package com.my.app.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.app.es.Item;

@RestController
@RequestMapping("mq")
public class MqSendController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("send")
    public void send() {
        //(交换机,routingKey,消息内容)
    	Item it = new Item();
    	it.setId("5");
    	it.setTitle("这是消息");
        rabbitTemplate.convertAndSend("myDirectExchange","mine.direct",it);
    }
}
