package filter;

import interceptor.GeneralInterceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.User;

public class AdminFilterServlet extends HttpServlet implements Filter{
	private String redirectUrl = null;
		

	public void doFilter(ServletRequest request, ServletResponse response,
				FilterChain filterChain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request2 = (HttpServletRequest) request;
		HttpServletResponse response2 = (HttpServletResponse) response;
		HttpSession session = request2.getSession();
		User user = (User) session.getAttribute("user");
		if(user.getRole()!=1) {
			response2.sendRedirect(redirectUrl);
		}
	}

	
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		redirectUrl = "/TW/component/roleError.jsp" ;
	}
	
}
