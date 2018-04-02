package com.user.mgmt.model;

public class UserSecurityInfo {
	
	private User user;
	private String securityQuestion;
	private String securityAnswer;
	
	public UserSecurityInfo() {
	}

	public UserSecurityInfo(User user, String securityQuestion, String securityAnswer) {
		super();
		this.user = user;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	@Override
	public String toString() {
		return "UserSecurityInfo [user=" + user + ", securityQuestion=" + securityQuestion + ", securityAnswer="
				+ securityAnswer + "]";
	}

}
