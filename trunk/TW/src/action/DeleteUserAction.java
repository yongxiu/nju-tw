package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;

public class DeleteUserAction extends ActionSupport{
	/**
	 * Delete user
	 * Wjc
	 */
	private int id;
	public String execute() {
		UserDao userDao = new UserDao();
		userDao.delete(new Long(getId()));
		return SUCCESS;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
