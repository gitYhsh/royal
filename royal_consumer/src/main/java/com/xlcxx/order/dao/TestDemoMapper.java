package com.xlcxx.order.dao;

import com.xlcxx.common.config.database.MyMapper;
import com.xlcxx.order.domian.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDemoMapper extends MyMapper<Test> {
}