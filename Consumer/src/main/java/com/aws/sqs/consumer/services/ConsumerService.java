package com.aws.sqs.consumer.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private static Logger log = LoggerFactory.getLogger(ConsumerService.class);

    public void readMsg(String msg){
        log.info("Msg: " + msg);
    }
}
