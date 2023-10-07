package com.mj.service;

import java.util.List;

import com.mj.vo.UserVO;

public interface UserService {
	
	List<UserVO> getAllUser();
	UserVO getUserById(int id);
	void saveUser(UserVO userVO);
	void updateUser(UserVO userVo);
	void deleteUser(int id);

}
