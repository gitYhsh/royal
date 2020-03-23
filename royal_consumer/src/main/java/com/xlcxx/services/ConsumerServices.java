package com.xlcxx.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Description: nocos_test
 * Created by yhsh on 2020/3/14 13:44
 * version 2.0
 * 方法说明
 */
@FeignClient(name = "royal-provider",fallback = EchoServiceFallback.class,configuration = FeignConfiguration.class)
public interface ConsumerServices {

	@GetMapping(value = "/echoProvideFegin/{str}")
	String echo(@PathVariable("str") String str);

}

 class FeignConfiguration {
	@Bean
	public EchoServiceFallback echoServiceFallback() {
		return new EchoServiceFallback();
	}
}

 class EchoServiceFallback implements ConsumerServices {
	 public String echo(String str) {
		 return "服务熔断";
	 }
 }
