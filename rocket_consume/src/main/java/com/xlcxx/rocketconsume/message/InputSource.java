package com.xlcxx.rocketconsume.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Description: royal
 * Created by yhsh on 2020/4/8 15:36
 * version 2.0
 * 方法说明
 */
public interface InputSource {

	@Input("input1")
	SubscribableChannel input1();
}
