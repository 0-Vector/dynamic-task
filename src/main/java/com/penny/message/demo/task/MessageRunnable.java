package com.penny.message.demo.task;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author 0-Vector
 * @date 2019/4/12 13:23
 */
@Slf4j
@Component
public class MessageRunnable implements Runnable {

    /**
     * 发送消息的地址
     */
    public static final String MESSAGE_SEND_URL = "";

    private RestTemplate restTemplate;

    public MessageRunnable(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public void run() {
        log.info("==> 执行任务 ...");

        // TODO some business code

        // 1. 获取业务数据并组装成要发送的消息对象

        // 2. 发送消息
        System.out.println(restTemplate);

    }
}
