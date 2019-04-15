package com.penny.message.demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 0-Vector
 * @date 2019/4/15 11:48
 */
@Getter
@Setter
@ToString
public class MessageInfo {

    @JsonProperty("client_id")
    private Integer clientId;

    private Message message;

}
