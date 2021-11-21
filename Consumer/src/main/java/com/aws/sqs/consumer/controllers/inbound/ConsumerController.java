package com.aws.sqs.consumer.controllers.inbound;

import com.aws.sqs.consumer.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Controller;

@Controller
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @JmsListener(destination = "${consumer.queue}")
    public void listenQueue(String msg){
        consumerService.readMsg(msg);
    }
}
