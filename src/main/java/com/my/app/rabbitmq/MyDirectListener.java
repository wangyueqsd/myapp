package com.my.app.rabbitmq;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.my.app.es.Item;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue("myDirectQueue"),
        exchange = @Exchange(value = "myDirectExchange", type = ExchangeTypes.DIRECT),
        key = "mine.direct"
))
public class MyDirectListener {

    /**
     * listenerAdapter
     *
     * @param msg 消息内容,当只有一个参数的时候可以不加@Payload注解
     */
    @RabbitHandler
    public void onMessage(@Payload Item msg) {
        System.out.println(JSONObject.toJSON(msg));
    }
}