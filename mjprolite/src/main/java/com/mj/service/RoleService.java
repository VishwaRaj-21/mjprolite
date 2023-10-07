package com.mj.service;

import java.util.List;

import com.mj.vo.RoleVO;

public interface RoleService {
	
	 List<RoleVO> getAllRole();
	 RoleVO getRoleById(int id);
	 void saveRole(RoleVO roleVo);
	 void updateRole (RoleVO roleVo);
	 void deleteRole(int id);

}
