package com.gmw.message.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author 0-Vector
 * @date 2019/4/12 10:33
 */
@SpringBootApplication
@EnableScheduling
public class MsgDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgDemoApplication.class, args);
	}

}
