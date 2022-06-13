package com.revature.reimbusment.models;

/**
 * Class to store user info - for both employee and management
 * userID stored in this class
 * reimbursement requests will be associated to employee by ID
 * @author jacki
 *
 */

public class UserInfo {
	int userId;
	String password;
	
	// constructors
	//New users need to provide both userID (employee id) and a password
	public UserInfo(int userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}
	
	
	//method
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
