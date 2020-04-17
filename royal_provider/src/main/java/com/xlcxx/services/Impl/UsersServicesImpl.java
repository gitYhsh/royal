package com.xlcxx.services.Impl;

import com.xlcxx.services.UserServices;
import com.xlcxx.services.baseServices.impl.BaseServices;
import com.xlcxx.user.system.domian.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: royal
 * Created by yhsh on 2020/3/30 10:52
 * version 2.0
 * 方法说明
 */
@Service
public class UsersServicesImpl extends BaseServices<Test> implements UserServices {

	@Override
	public List<Test> getallUser() {
		return this.selectAll();
	}

	@Override
	public int insertUser()  {
		try {
			Test test = new Test("张三",10);
			int i =  this.save(test);
			List<String> list= new ArrayList<>();
			list.add("3");

			String cide = list.get(8) ;
			System.out.println(cide);
			return i;
		}catch (Exception e){
			e.printStackTrace();
			throw  new RuntimeException("except");
		}
	}
}
