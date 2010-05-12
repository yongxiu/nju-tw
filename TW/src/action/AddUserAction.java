package action;

import service.ValidateUser;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class AddUserAction extends ActionSupport{
	private String  username;
	private String  password;
	private String  passwordConfirmed;
	private String  name;
	
	
	//add user
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(!ValidateUser.ifUsernameCanBeUsed(getUsername())) {
			addActionMessage("username has exist!");
			return INPUT;
		}
		else if(!getPassword().equals(getPasswordConfirmed())) {
			addActionMessage("两次密码输入不一致");
			return INPUT;
		}
		else {
			UserDao userDao = new UserDao();
			User user = new User(getUsername(), getPassword(), getName(), 2);
			userDao.create(user);
			return SUCCESS;
		}
		
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


	public String getPasswordConfirmed() {
		return passwordConfirmed;
	}


	public void setPasswordConfirmed(String passwordConfirmed) {
		this.passwordConfirmed = passwordConfirmed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	
	
}
