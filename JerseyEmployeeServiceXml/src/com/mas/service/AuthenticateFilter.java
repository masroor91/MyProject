package com.mas.service;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticateFilter implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req= (HttpServletRequest) request;
		
		String authUserNamePass= req.getHeader("Authorization");
		
		AuthenticateService as = new AuthenticateService();
		Boolean isAuthenticatedUser=as.isValidUser(authUserNamePass);
		
		if(isAuthenticatedUser){
			chain.doFilter(request, response);
		}
		else{
			HttpServletResponse resp= (HttpServletResponse) response;
			resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
