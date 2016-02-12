package lesson03.servlets;

import java.io.IOException;

import javax.servlet.*;

public class HelloWorld implements Servlet {
	ServletConfig config;
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출됨");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig() 호출됨");
		return this.config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInto() 호출됨");
		return "version=1.0;author=WonjuneLee;copyright=WonjuneLee 2016";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init() 호출됨");
		this.config = arg0;
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("service() 호출됨");
		
	}
	
	
}
