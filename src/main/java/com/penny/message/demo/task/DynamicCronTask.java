package com.penny.message.demo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * @author 0-Vector
 * @date 2019/4/12 10:35
 */
@Slf4j
//@RestController
public class DynamicCronTask implements SchedulingConfigurer{

//    private static String cron = "15 */2 * * * ?";
//
//    @PostMapping("/scheduler")
//    public String updateScheduler(HttpServletRequest request, String cron) {
//        log.info("==>: 调整scheduler参数为[{}]", cron);
//        DynamicCronTask.cron = cron;
//        return "成功！";
//    }
//
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
//        scheduledTaskRegistrar.addTriggerTask(() -> {
//            // 定时任务所应该执行的业务逻辑
//            log.info("==> 定时任务开始执行...");
//
//            Object message = getMessage();
//
//            send(message);
//
//        }, triggerContext -> {
//            // 任务触发，可修改任务的执行计划
//            log.info("==> 修改任务执行计划");
//            CronTrigger trigger = new CronTrigger(cron);
//            return trigger.nextExecutionTime(triggerContext);
//        });
    }
//
//    /**
//     * 发送消息
//     * @param message 要发送的消息对象
//     */
//    private void send(Object message) {
//        // 发送消息
//        log.info("==> 发送消息...");
//    }
//
//    /**
//     * 构建消息内容
//     * @return 消息内容
//     */
//    private Object getMessage() {
//        Object message = null;
//
//        // some business
//        log.info("==> 获取要发送的消息内容...");
//        try {
//            sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        return message;
//    }
//
//    @Override
//    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
//        scheduledTaskRegistrar.addTriggerTask(new Runnable() {
//            @Override
//            public void run() {
//                // 定时任务所应该执行的业务逻辑
//                System.out.println("dynamicCronTask is running...");
//            }
//        }, new Trigger() {
//            @Override
//            public Date nextExecutionTime(TriggerContext triggerContext) {
//                // 任务触发，可修改任务的执行计划
//                CronTrigger trigger = new CronTrigger(cron);
//                System.out.println("cron:" + cron);
//                Date nextExecutor = trigger.nextExecutionTime(triggerContext);
//                return nextExecutor;
//            }
//        });
//    }
}
