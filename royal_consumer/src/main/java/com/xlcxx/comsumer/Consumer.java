package com.xlcxx.comsumer;

import com.xlcxx.services.SeataDemoServices;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.xlcxx.services.ConsumerServices;

/**
 * Description: nocos_test
 * Created by yhsh on 2020/3/14 13:36
 * version 2.0
 * 方法说明
 */
@RestController
public class Consumer {

	@Autowired
	private SeataDemoServices seataDemoServices;

	@GetMapping("/echo2/{str}")
	public String echo2(@PathVariable String str) {
		try {
			return seataDemoServices.SeataDemotest(str);
		}catch (Exception e){
			return e.getMessage();
		}

	}





}
