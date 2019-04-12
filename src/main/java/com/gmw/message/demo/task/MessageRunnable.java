package com.gmw.message.demo.task;

import lombok.extern.slf4j.Slf4j;

import static java.lang.Thread.sleep;

/**
 * @author 0-Vector
 * @date 2019/4/12 13:23
 */
@Slf4j
public class MessageRunnable implements Runnable {
    @Override
    public void run() {
        log.info("==> 执行任务 ...");
        // TODO some business code
    }
}
