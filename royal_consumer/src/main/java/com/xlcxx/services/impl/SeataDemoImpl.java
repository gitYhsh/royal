package com.xlcxx.services.impl;

import com.xlcxx.order.domian.Test;
import com.xlcxx.services.ConsumerServices;
import com.xlcxx.services.SeataDemoServices;
import com.xlcxx.services.baseServices.impl.BaseServices;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: royal
 * Created by yhsh on 2020/3/30 9:24
 * version 2.0
 * 方法说明
 */
@Service
public class SeataDemoImpl extends BaseServices<Test> implements SeataDemoServices {

	@Autowired
	private ConsumerServices consuServices;

	@Override
	@GlobalTransactional(name = "royal-consumer",rollbackFor = Exception.class)
	public String SeataDemotest(String demo1) throws Exception{
		try {
			List<Test> list = this.selectAll();
			Test test = new Test("demo");
			int num  = this.save(test);
			String demo = consuServices.echo("我是生产者");
			System.out.println(num+"----------------------------");
			return list.toString()+"-----------生产者的信息:"+demo+"前端传输的数据是："+demo1+"------"+num;
		}catch (Exception e){
			e.printStackTrace();
			throw  new RuntimeException("111");
		}

	}
}
