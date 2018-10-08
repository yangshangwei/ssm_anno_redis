package com.artisan.ssm_redis.service;

import java.util.List;

import com.artisan.ssm_redis.domain.Role;

public interface RoleService {
	public Role getRole(Long id);

	public int deleteRole(Long id);

	public Role insertRole(Role role);

	public int updateRole(Role role);

	public List<Role> findRoles(String roleName, String note);
	
	public int insertRoles(List<Role> roleList);
}