package com.user.available.svc.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.user.available.dao.UserAvailableDao;
import com.user.available.dao.impl.UserAvailableDaoImpl;
import com.user.mgmt.model.User;

@Path("rest")
public class UserAvailableServiceRest {
	
	private UserAvailableDao userAvailableDao;
	
	@GET
	@Path("/fetch/{userId}")
	public String userAvailabilityService(@PathParam("userId") String userId) {
		userAvailableDao = new UserAvailableDaoImpl();
		String status = userAvailableDao.userAvailabilityServiceDao(userId);
		return status;
	}
	
	@GET
	@Path("/fetchSecurity/{userId}")
	public String fetchSecurityQuestion(@PathParam("userId") String userId) {
		userAvailableDao = new UserAvailableDaoImpl();
		String securityQuestion = userAvailableDao.fetchSecurityQuestion(userId);
		System.out.println(securityQuestion);
		return securityQuestion;
	}
	
	@GET
	@Path("/resetPassword/{userId}")
	public String validateUserPassword(@PathParam("userId") String userId) {
		userAvailableDao = new UserAvailableDaoImpl();
		System.out.println("Rest call to reset password");
		System.out.println("User Id:"+userId);
		String password = userAvailableDao.validateResetPassword(userId);
		System.out.println("password : "+password);
		return password;
	}
	
	@GET
	@Path("/populateUser/{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> populateUser(@PathParam("userName") String userName) {
		userAvailableDao = new UserAvailableDaoImpl();
		List<User> userList = userAvailableDao.populateUserDetails(userName);
		return null;
	}
	
	public static void main(String[] args) {
		UserAvailableServiceRest uasr = new UserAvailableServiceRest();
		uasr.populateUser("User Name");
	}
	
	
	

}
