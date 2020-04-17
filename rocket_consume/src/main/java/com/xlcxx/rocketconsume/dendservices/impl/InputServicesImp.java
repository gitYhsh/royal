package com.xlcxx.rocketconsume.dendservices.impl;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * Description: royal
 * Created by yhsh on 2020/4/8 15:40
 * version 2.0
 * 方法说明
 */
@Service
public class InputServicesImp  {

	@StreamListener("input1")
	public void receiveInput1(String receiveMsg) {
		System.out.println("input1 receive: " + receiveMsg);
	}

}
