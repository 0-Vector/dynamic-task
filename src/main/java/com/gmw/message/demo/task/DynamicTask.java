package com.gmw.message.demo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.concurrent.ScheduledFuture;

/**
 * @author 0-Vector
 * @date 2019/4/12 13:20
 */
@Slf4j
@Component
@RestController
public class DynamicTask {

    /**
     * 默认cron表达式
     */
    private String cron = "* */5 * * * *";

    /**
     * 自动刷新cron表达式的频率
     */
    private static final long CRON_REFRESH_FIXED_RATE = 1000 * 60 * 10;

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    private ScheduledFuture<?> future;

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        return new ThreadPoolTaskScheduler();
    }

    @PostConstruct
    public void startTask() {
        if (future != null) {
            future.cancel(true);
        }
        future = threadPoolTaskScheduler.schedule(new MessageRunnable(), new CronTrigger(cron));
        log.info("DynamicTask.startTask()");
    }

    /**
     * 定时任务
     * 定时获取最新的cron表达式，并更新本任务cron
     * @return 定时cron表达式
     */
    @Scheduled(fixedRate = CRON_REFRESH_FIXED_RATE)
    public void autoRefreshCron() {
        this.cron = getLatestCron();
        startTask();
        log.info("==> 定时更新任务计划cron完成！cron值[{}]", cron);
    }

    /**
     * 从远程配置中心获取任务cron表达式的方法
     * @return
     */
    private String getLatestCron() {
        // TODO 获取最新的cron配置
        return "*/10 * * * * *";
    }

    /**
     * TODO 仅作为测试使用
     * 即时更新配置
     * @param cron 传入cron表达式
     */
    @PostMapping("/cron")
    public void refreshCron(String cron) {
        this.cron = cron;
        startTask();
        log.info("==> 更新cron");
    }
}
