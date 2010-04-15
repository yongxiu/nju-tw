package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{
	
	private String username;
	private String password;
	
	private static final long serialVersionUID = 1L;

	public String execute()throws Exception {
		if(username.equals("1")&&password.equals("1"))
			return SUCCESS;	
		
		return INPUT;
		
		
		
	}

	public void setSession(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
