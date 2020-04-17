package com.xlcxx.rocketproduce.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Description: royal
 * Created by yhsh on 2020/4/8 14:58
 * version 2.0
 * 方法说明  发送信息方法
 */
public interface OutSource {

	@Output("output1")
	MessageChannel sendout1();

}
