package com.test.model;


/**
 * @Description:User 
 * @author: Lee
 * @time:Sep 13, 2017 4:34:09 PM
 */
public class User {

	private Integer userId;
	private String userName;
	private int userAge;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString(){
		return "User [userID="+userId+",userName="+userName+",userAge="+userAge+"]";
	}
	

}
