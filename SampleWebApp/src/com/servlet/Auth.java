package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Auth
 */
public class Auth extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PROFILE_PAGE = "/profile.jsp";
	private static final String USER_NAME = "userName";
	private static final String PASSWORD = "password";
	private static final String INVALID_USER_MESSAGE = "Invalid User ID or Password!";
	private static final String INDEX_PAGE = "/index.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter(USER_NAME);
		String password = request.getParameter(PASSWORD);
		if(userName.equals(password)) {
			request.setAttribute("userName", userName);
			request.getRequestDispatcher(PROFILE_PAGE).forward(request, response);
		}else {
			request.setAttribute("userName", userName);
			request.setAttribute("loginError", INVALID_USER_MESSAGE);
			request.getRequestDispatcher(INDEX_PAGE).forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
