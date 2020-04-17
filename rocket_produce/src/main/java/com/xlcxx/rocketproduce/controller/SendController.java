package com.xlcxx.rocketproduce.controller;

import com.xlcxx.rocketproduce.services.SendServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description: royal
 * Created by yhsh on 2020/4/8 15:06
 * version 2.0
 * 方法说明
 */
@Controller
public class SendController {

	@Autowired
	private SendServices sendServices;

	@RequestMapping(value = "sendMsg")
	@ResponseBody
	public Object sendMsg(){
		sendServices.sendMsg("这是一个普通得消息");
		return "发送";
	}


}
