package com.penny.message.demo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 0-Vector
 * @date 2019/4/15 11:49
 */
@Getter
@Setter
@ToString
public class Message {

    private String url;

    private MessageData data;
}
