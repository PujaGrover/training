package com.veritis.web.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public FilterConfig filterConfig = null;

	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("We are inside the filter");
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		boolean isAuthenticated = false;
		if (httpRequest.getSession(true).getAttribute("isAuthenticated") != null){
			isAuthenticated = (Boolean) httpRequest.getSession(true).getAttribute("isAuthenticated");
		}
		String url = httpRequest.getRequestURL().toString();
		if (!isAuthenticated && !url.contains("login.jsp")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			if (null == username && null == password) {
				filterConfig.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			} else if (username.equalsIgnoreCase("admin") && password.equals("veritis")) {
				httpRequest.getSession(true).setAttribute("isAuthenticated", true);
				// String url=httpRequest.getRequestURL().toString();
				/// String
				// urlPattern=url.substring(url.lastIndexOf("/"),url.length());
				// filterConfig.getServletContext().getRequestDispatcher("/veritis"+urlPattern).forward(request,
				// response);
			} else {
				filterConfig.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}

		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		filterConfig = fConfig;
	}

}
