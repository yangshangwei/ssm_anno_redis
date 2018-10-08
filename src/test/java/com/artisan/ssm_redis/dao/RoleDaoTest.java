package com.artisan.ssm_redis.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.artisan.ssm_redis.config.RedisConfig;
import com.artisan.ssm_redis.config.RootConfig;

public class RoleDaoTest {

	public static void main(String[] args) {
		// 使用注解Spring IoC容器
		ApplicationContext ctx = new AnnotationConfigApplicationContext(RootConfig.class, RedisConfig.class);
		
	}
}
