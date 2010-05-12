package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import bean.User;
import dao.UserDao;

public class GetModifyListAction extends ActionSupport implements SessionAware{
	private int id;
	private User user;
	private Map session;

	public String execute() {
		UserDao userDao = new UserDao();
		user = userDao.getById(new Long(getId()));
		getSession().put("user", getUser());
		return SUCCESS;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	
	
	
}
