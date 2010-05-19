package action;

import interceptor.UserInterceptor;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

public class CheckLoginAction extends ActionSupport implements SessionAware{

	private String username;

	private int role;
	private String name;

	private Map session;
	
	public String execute() throws Exception {
		
		
		if(getSession().get("user")!=null) {
			
			username = (String) getSession().get(UserInterceptor.USER_KEY);
			name = (String) getSession().get("name");
			User user = (User)getSession().get("user");
			role = user.getRole();
			return SUCCESS;
		}
			
		else {
			return INPUT;
		}
		
	}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

		
}
