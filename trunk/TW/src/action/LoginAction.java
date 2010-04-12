package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{
	
	 private String userName;
	private String password;
	
	public String execute()throws Exception {
		return SUCCESS;		
		
		
		//UserDAO userDAO=new UserDAO();
		//User user=new User();
		//user.setUserName(userName);
		//user.setPassword(password);
		

		//int ret=userDAO.check(user);
		/*if(ret==1){
			session.put(AuthenticationStudentInterceptor.USER_SESSION_KEY,  userName);
			 
			
			return "studentLogin";
		}else if(ret==2){
			 session.put(AuthenticationAdminInterceptor.ADMIN_SESSION_KEY, userName);
		
			
			return "adminLogin";
		}else{
			return INPUT;
		}
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}*/
	}

	public void setSession(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
