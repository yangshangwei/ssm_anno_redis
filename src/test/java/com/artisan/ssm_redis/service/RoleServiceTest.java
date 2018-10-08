package com.artisan.ssm_redis.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.artisan.ssm_redis.config.RedisConfig;
import com.artisan.ssm_redis.config.RootConfig;
import com.artisan.ssm_redis.domain.Role;

public class RoleServiceTest {

	public static void main(String[] args) {
		// 使用注解Spring IoC容器
		ApplicationContext ctx = new AnnotationConfigApplicationContext(RootConfig.class, RedisConfig.class);
		// 获取角色服务类
		RoleService roleService = ctx.getBean(RoleService.class);

		Role role = new Role();
		role.setRoleName("role_name_1");
		role.setNote("role_note_1");
		// 插入角色
		roleService.insertRole(role);
		
		// 获取角色
		Role role2 = roleService.getRole(role.getId());
		System.out.println(role2.toString());
		// 更新角色
		role2.setNote("role_note_1_update");
		roleService.updateRole(role2);
		System.out.println(role2.toString());
		// 删除角色
		// roleService.deleteRole(role2.getId());
	}

}
