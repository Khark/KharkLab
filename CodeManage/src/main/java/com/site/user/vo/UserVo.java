package com.site.user.vo;

public class UserVo {

	private int UserNM;
	private String UserId;
	private String UserPw;
	private int AccessCount;
	private String UserName;
	private String UserInfo1;
	private String UserInfo2;
	
	private String CodeAuth;

	public int getUserNM() {
		return UserNM;
	}

	public void setUserNM(int userNM) {
		UserNM = userNM;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserPw() {
		return UserPw;
	}

	public void setUserPw(String userPw) {
		UserPw = userPw;
	}

	public int getAccessCount() {
		return AccessCount;
	}

	public void setAccessCount(int accessCount) {
		AccessCount = accessCount;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserInfo1() {
		return UserInfo1;
	}

	public void setUserInfo1(String userInfo1) {
		UserInfo1 = userInfo1;
	}

	public String getUserInfo2() {
		return UserInfo2;
	}

	public void setUserInfo2(String userInfo2) {
		UserInfo2 = userInfo2;
	}

	public String getCodeAuth() {
		return CodeAuth;
	}

	public void setCodeAuth(String codeAuth) {
		CodeAuth = codeAuth;
	}

	@Override
	public String toString() {
		return "UserVo [UserNM=" + UserNM + ", UserId=" + UserId + ", UserPw=" + UserPw + ", AccessCount=" + AccessCount
				+ ", UserName=" + UserName + ", UserInfo1=" + UserInfo1 + ", UserInfo2=" + UserInfo2 + ", CodeAuth="
				+ CodeAuth + "]";
	}
	
	
	
	
}
