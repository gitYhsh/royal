package com.plodes.plodes.system.services.Impl;

import com.plodes.plodes.baseServices.impl.BaseServices;
import com.plodes.plodes.mapper.system.UserMapper;
import com.plodes.plodes.system.domian.User;
import com.plodes.plodes.system.services.UserServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: plodes
 * Created by yhsh on 2020/3/19 10:39
 * version 2.0
 * 方法说明
 */
@Service
public class UserServicesImpl extends BaseServices<User> implements UserServices {

	private static Logger logger = LoggerFactory.getLogger(UserServicesImpl.class);
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getAllUser(String username) {
		try {
			return this.selectAll();
		}catch (Exception e){
			e.printStackTrace();
			logger.error("获取用户列表失败："+e.getMessage());
		}
		return new ArrayList<>();
	}
	@Override
	public User findUserByUsername(String username) {
		try {
			Example example = new Example(User.class);
			example.createCriteria().andEqualTo("userId",username);
			return  userMapper.selectOneByExample(example);
		}catch (Exception e){
			logger.error("获取用户失败:"+e.getMessage());
		}
		return new User();
	}
}
