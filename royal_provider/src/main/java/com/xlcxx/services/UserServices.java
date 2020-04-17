package com.xlcxx.services;

import com.xlcxx.services.baseServices.IServices;
import com.xlcxx.user.system.domian.Test;

import java.util.List;

/**
 * Description: royal
 * Created by yhsh on 2020/3/30 10:49
 * version 2.0
 * 方法说明
 */
public interface UserServices extends IServices<Test> {

	List<Test> getallUser();

	int  insertUser() ;
}
