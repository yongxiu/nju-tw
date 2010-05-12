package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.ValidateUser;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class ModifyUserAction extends ActionSupport implements SessionAware{
	 private  String username;
	 private  String name;
	 private User user;
	 private Map session;
	 
	 public String execute() {
		 UserDao userDao = new UserDao();
		 User user= (User) getSession().get("user");
		// getSession().remove("user");
		 
		 if(getUsername().equals(user.getUsername())) {
			 user.setUsername(getUsername());
			 user.setName(getName());
			 userDao.update(user);
			 return SUCCESS;
		 }
		 //validate
		 if(!ValidateUser.ifUsernameCanBeUsed(getUsername())) {
			 addActionMessage("用户名已存在!");
			 setUser(user);
			 return INPUT;
		 }
		 
		 
		 user.setUsername(getUsername());
		 user.setName(getName());
		 userDao.update(user);
		 return SUCCESS;
	 }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
		
	 
}
