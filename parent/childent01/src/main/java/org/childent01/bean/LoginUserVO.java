package org.childent01.bean;

import java.io.Serializable;

public class LoginUserVO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;
	
	private String userPasswd;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setUserPasswd(String userPasswd) {
		this.userPasswd = userPasswd;
	}

}
