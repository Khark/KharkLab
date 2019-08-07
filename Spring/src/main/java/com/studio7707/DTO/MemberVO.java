package com.studio7707.DTO;

import java.sql.Date;

public class MemberVO {

	private String userId;
	private String userPW;
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
		return userPW;
	}
	public void setUserPw(String userPW) {
		this.userPW = userPW;
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
		return "MemberVO [userId=" + userId + ", userPw=" + userPW + ", userName=" + userName + ", userEmail="
				+ userEmail + ", userRegdate=" + userRegdate + ", userUpdateday=" + userUpdateday + "]";
	}
	

}
