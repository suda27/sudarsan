package com.user.available.dao;

import java.util.List;

import com.user.mgmt.model.User;

public interface UserAvailableDao {
	
	public String userAvailabilityServiceDao(String userId);
	
	public String fetchSecurityQuestion(String userId);

	public String validateResetPassword(String password);

	public List<User> populateUserDetails(String userName);

}
