package com.site.user.service;

import java.util.List;

import com.site.user.vo.UserVo;

public interface UserService {

	public void joinUser(UserVo vo) throws Exception;
	public UserVo infoUser(int userNM) throws Exception;
	public List<UserVo> listUser() throws Exception;
	public UserVo ListUser(String UserId) throws Exception;
	public void modifyUser(int UserNM) throws Exception;
	
}
