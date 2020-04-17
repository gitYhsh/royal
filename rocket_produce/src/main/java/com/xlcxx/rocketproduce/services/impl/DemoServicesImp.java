package com.xlcxx.rocketproduce.services.impl;

import com.xlcxx.rocketproduce.message.OutSource;
import com.xlcxx.rocketproduce.services.SendServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * Description: royal
 * Created by yhsh on 2020/4/8 15:00
 * version 2.0
 * 方法说明  发送方法
 */
@Service
public class DemoServicesImp implements SendServices {

	@Autowired
	private OutSource outsource;


	public  void  sendMsg (String msg){
			outsource.sendout1().send(MessageBuilder.withPayload(msg).build());
	}


}
