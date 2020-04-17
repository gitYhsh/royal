package com.xlcxx.services;

import com.xlcxx.order.domian.Test;
import com.xlcxx.services.baseServices.IServices;

/**
 * Description: royal
 * Created by yhsh on 2020/3/30 9:23
 * version 2.0
 * 方法说明
 */
public interface SeataDemoServices extends IServices<Test> {

	/**测试seata的分布式事务**/

	String SeataDemotest(String demo) throws Exception;

}
