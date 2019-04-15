package com.penny.message.demo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 0-Vector
 * @date 2019/4/15 11:34
 */
@Getter
@Setter
@ToString
public class SimpleResponse {

    private int code;

    private String message;

    private TaskInfo data;

}
