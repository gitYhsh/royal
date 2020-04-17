package com.xlcxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Description: nocos_test
 * Created by yhsh on 2020/3/14 10:04
 * version 2.0
 * 方法说明
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = {"com.xlcxx.user.system.dao"})
public class NacosProvider {
	public static void main(String[] args) {
		SpringApplication.run(NacosProvider.class,args);
	}



}