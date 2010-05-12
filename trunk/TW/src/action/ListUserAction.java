package action;

import java.util.ArrayList;

import bean.User;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class ListUserAction extends ActionSupport{
	private ArrayList<User> users;
	
	public String execute() {
		UserDao userDao = new UserDao();
		users = (ArrayList<User>) userDao.getAllEntity();
		return SUCCESS;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	
}
