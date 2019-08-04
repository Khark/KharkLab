package com.studio7707.VO;

import java.sql.Date;

public class MemberVO {

	private String userId;
	private String userPw;
	private String userName;
	private String userEmail;
	private Date   userRegdate;
	private Date   userUpdateday;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getUserRegdate() {
		return userRegdate;
	}
	public void setUserRegdate(Date userRegdate) {
		this.userRegdate = userRegdate;
	}
	public Date getUserUpdateday() {
		return userUpdateday;
	}
	public void setUserUpdateday(Date userUpdateday) {
		this.userUpdateday = userUpdateday;
	}
	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userEmail="
				+ userEmail + ", userRegdate=" + userRegdate + ", userUpdateday=" + userUpdateday + "]";
	}
	

}
