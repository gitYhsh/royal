package com.xlcxx.controller;

import com.xlcxx.services.UserServices;
import com.xlcxx.user.system.domian.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: nocos_test
 * Created by yhsh on 2020/3/14 10:09
 * version 2.0
 * 方法说明
 */
@RestController
@RefreshScope
public class Demo {

	@GetMapping("/echoProvide/{string}")
	public String echo(@PathVariable String string) {
		return "this is restTemplate " + string+"  配置中心的参数获取";
	}

	@Autowired
	private UserServices userServices;

	@GetMapping("/echoProvideFegin/{string}")
	public String echoProvideFegin(@PathVariable String string) {
			int num  = userServices.insertUser();

			return "this is FeignClient 17356" + string+"  配置中心的参数获取,获取到的人员数组"+num;


	}

}
