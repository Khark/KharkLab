package com.site.user.dao;

import java.util.List;

import com.site.user.vo.UserVo;

public interface UserDao {

	public void joinUser(UserVo vo) throws Exception;
	
	public UserVo infoUser(int UserNM)throws Exception;
	
	public List<UserVo> listUser() throws Exception;
	
	public UserVo listUser(String userId) throws Exception;
	
	public void modifyUser(int UserNM) throws Exception;
	
}
